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
        System.out.println("Welcome to the Dice simulator");
        ZombieDiceRed red = new ZombieDiceRed();
        red.RedRoll();
        System.out.println("Red Face = " + red.RedGetFace());
        ZombieDiceGreen green = new ZombieDiceGreen();
        green.GreenRoll();
        System.out.println("Green Face = " + green.GreenGetFace());
        ZombieDiceYellow yellow = new ZombieDiceYellow();
        yellow.YellowRoll();
        System.out.println("Yellow Face = " + yellow.YellowGetFace());
        ZombieDiceGreen GreenDice[] = new ZombieDiceGreen[6];
        int diceRolled = rand.nextInt(GreenDice.length+1);
        GreenDice[diceRolled].GreenRoll();

        System.out.println("Green dice From a List: " + GreenDice[diceRolled].GreenGetFace());
    }
}
