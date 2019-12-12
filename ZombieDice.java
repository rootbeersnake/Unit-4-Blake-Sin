/*
brain = 1
foot = 2
shotgun = 3
6 Green
4 Yellow
3 Red
*/
import java.util.Scanner;


public class PigDice{
  public static void main(String[] args){
    //initiliaze variables
    int answer = 5;
    int p1Score = 0;
    int p2Score = 0;
    boolean p1Turn = true;
    int roundScore = 0;

    // scanner for part 1
    Scanner scan = new Scanner(System.in);
    //Dice dice1 = new Dice();
    //Dice dice2 = new Dice();

    //red dice
    ZombieDiceRed red1 = new ZombieDiceRed();
    ZombieDiceRed red2 = new ZombieDiceRed();
    ZombieDiceRed red3 = new ZombieDiceRed();

    //yellow dice
    ZombieDiceYellow yellow1 = new ZombieDiceYellow();
    ZombieDiceYellow yellow2 = new ZombieDiceYellow();
    ZombieDiceYellow yellow3 = new ZombieDiceYellow();
    ZombieDiceYellow yellow4 = new ZombieDiceYellow();

    //green dice
    ZombieDiceGreen green[] = new ZombieDiceGreen[6];

    // game in command prompt
    while(answer != 0){
      System.out.println("");
    System.out.println("enter 1 to roll and 2 to pass. enter 0 to quit");
    System.out.println("");
    answer = scan.nextInt();
    if(answer == 1){
      dice1.roll();
      dice2.roll();
      System.out.println("");
      System.out.println("Player 1's turn = " + p1Turn);
      System.out.println("d1 rolled: " + dice1.getFace());
      System.out.println("d2 rolled: " + dice2.getFace());
      System.out.println("");
      if(dice1.getFace() == 1 || dice2.getFace() == 1){
        if(dice1.getFace() == 1 && dice2.getFace() == 1){
          roundScore = 0;
          if(p1Turn == true){
            p1Score = 0;
            System.out.println("");
            System.out.println("You rolled double ones. changing turns");
            System.out.println("Player 1's score: " + p1Score);
            System.out.println("Player 2's score: " + p2Score);
            p1Turn = false;
            System.out.println("Player 1's turn = " + p1Turn);
            System.out.println("");
          }else{
            p2Score = 0;
            System.out.println("");
            System.out.println("You rolled double ones. changing turns");
            System.out.println("Player 1's score: " + p1Score);
            System.out.println("Player 2's score: " + p2Score);
            p1Turn = true;
            System.out.println("Player 1's turn = " + p1Turn);
            System.out.println("");
          }
        }else{
          roundScore = 0;
          System.out.println("");
          System.out.println("you rolled a one. changing turns");
          System.out.println("Player 1's score: " + p1Score);
          System.out.println("Player 2's score: " + p2Score);
          p1Turn = !p1Turn;
          System.out.println("Player 1's turn = " + p1Turn);
          System.out.println("");
        }

      }else{
        System.out.println("Round Score: " + roundScore);
        roundScore = roundScore + dice1.getFace() + dice2.getFace();
        System.out.println("");
        System.out.println("Round score: " + roundScore);
        System.out.println("Player 1's score: " + p1Score);
        System.out.println("Player 2's score: " + p2Score);
        System.out.println("Player 1's turn = " + p1Turn);
        System.out.println("");
      }
    }else if(answer == 2){
      if(p1Turn == true){
        p1Score = p1Score + roundScore;
        if(p1Score >= 100){
          p1Score = 0;
          p2Score = 0;
          roundScore = 0;
          p1Turn = true;
          System.out.println("");
          System.out.println("Player 1 won! Press 1 to play again or 0 to quit");
          System.out.println("");
          answer = scan.nextInt();
        }
        roundScore = 0;
        p1Turn = !p1Turn;
        System.out.println("");
        System.out.println("Player 1's score: " + p1Score);
        System.out.println("Player 2's score: " + p2Score);
        System.out.println("Player 1's turn = " + p1Turn);
        System.out.println("");
      }else{
        p2Score = p2Score + roundScore;
        if(p2Score >= 100){
          p1Score = 0;
          p2Score = 0;
          roundScore = 0;
          p1Turn = true;
          System.out.println("");
          System.out.println("Player 2 won! Press 1 to play again or 0 to quit");
          System.out.println("");
          answer = scan.nextInt();
        }
        roundScore = 0;
        p1Turn = !p1Turn;
        System.out.println("");
        System.out.println("Player 1's score: " + p1Score);
        System.out.println("Player 2's score: " + p2Score);
        System.out.println("Player 1's turn = " + p1Turn);
        System.out.println("");
      }
    }

    }
  }
}
