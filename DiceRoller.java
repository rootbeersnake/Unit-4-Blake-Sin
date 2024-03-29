import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        /*
        System.out.println("Welcome to the Dice simulator");
        Dice Dice1 = new Dice();
        Dice Dice2 = new Dice();
        Dice1.roll();
        Dice2.roll();
        System.out.println("Dice 1 = " + Dice1.getFace());
        System.out.println("Dice 2 = " + Dice2.getFace());
        Dice1.roll();
        Dice2.roll();
        System.out.println("Dice 1 = " + Dice1.getFace());
        System.out.println("Dice 2 = " + Dice2.getFace());
        */
        Random rand = new Random();
        ZombieDiceGreen GreenDice[] = new ZombieDiceGreen[6];
        for(int i = 0; i < GreenDice.length; i++){
          GreenDice[i] = new ZombieDiceGreen();
        }
        ZombieDiceRed RedDice[] = new ZombieDiceRed[3];
        for(int i = 0; i < RedDice.length; i++){
          RedDice[i] = new ZombieDiceRed();
        }
        ZombieDiceYellow YellowDice[] = new ZombieDiceYellow[4];
        for(int i = 0; i < YellowDice.length; i++){
          YellowDice[i] = new ZombieDiceYellow();
        }
        int listRolled;
        Integer diceRolledGreen;
        Integer diceRolledRed;
        Integer diceRolledYellow;
        int redList = 0 ;
        int greenList = 0;
        int yellowList = 0;
        //green = list1
        //red = list2
        //yellow = list3
      for(int b = 0; b < 3; b++){
        for(int i = 0; i < 3; i++){
          listRolled = rand.nextInt(3)+1;
          if(listRolled == 1){
            diceRolledGreen = rand.nextInt(GreenDice.length);
            System.out.println("Rolled from list: " + listRolled);
            while(diceRolledGreen == null){
              System.out.println("Object was null");
              diceRolledGreen = rand.nextInt(GreenDice.length);
            }
            GreenDice[diceRolledGreen].GreenRoll();
            //System.out.println("Rolled from list: " + listRolled);
            System.out.println("Green dice rolled: " + GreenDice[diceRolledGreen].GreenGetFace() + "\n");
            System.out.println("Green dice pulled: " + GreenDice[diceRolledGreen] + "\n");
            GreenDice[diceRolledGreen] = null;
            greenList++;
          }else if(listRolled == 2){
            diceRolledRed = rand.nextInt(RedDice.length);
            System.out.println("Rolled from list: " + listRolled);
            while(diceRolledRed == null){
              System.out.println("Object was null");
              diceRolledRed = rand.nextInt(RedDice.length);
            }

            RedDice[diceRolledRed].RedRoll();
            //System.out.println("Rolled from list: " + listRolled);
            System.out.println("Red dice rolled: " + RedDice[diceRolledRed].RedGetFace() + "\n");
            System.out.println("Red dice pulled: " + RedDice[diceRolledRed] + "\n");
            RedDice[diceRolledRed] = null;
            redList++;
          }else{
            diceRolledYellow = rand.nextInt(YellowDice.length);
            System.out.println("Rolled from list: " + listRolled);
            while(diceRolledYellow == null){
              System.out.println("Object was null");
              diceRolledYellow = rand.nextInt(YellowDice.length);
            }

            YellowDice[diceRolledYellow].YellowRoll();
            //System.out.println("Rolled from list: " + listRolled);
            System.out.println("Yellow dice rolled: " + YellowDice[diceRolledYellow].YellowGetFace() + "\n");
            System.out.println("Yellow dice pulled: " + YellowDice[diceRolledYellow] + "\n");
            YellowDice[diceRolledYellow] = null;
            yellowList++;
          }
        }
      }

    }
}
