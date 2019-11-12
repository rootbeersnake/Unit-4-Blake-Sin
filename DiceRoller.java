public class DiceRoller {
    public static void main(String[] args) {
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
    }
}
