/*
creates instances of the coin class and tests their attributes and behaviors
*/


public class Test{
  public static void main(String[] args){
    int Heads = 0;
    int Tails = 0;
    int totalFlips = 0;
    for(int i = 1; i<=10;i++){
    Coin myCoin = new Coin();
    System.out.println("My coin: "+myCoin.toString());
    if(myCoin.toString() == "Heads"){
      Heads++;
      totalFlips++;
    }else{
      Tails++;
      totalFlips++;
    }
  }
  System.out.println("Total number of flips: " + totalFlips);
  System.out.println("Heads: " + Heads);
  System.out.println("Tails: " + Tails);
  System.out.println("Percentage of flips that were heads: " + (((double) Heads/totalFlips) * 100) + "%");
  }
}
