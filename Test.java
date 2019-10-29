/*
creates instances of the coin class and tests their attributes and behaviors
*/


public class Test{
  public static void main(String[] args){
    int Heads = 0;
    int Tails = 0;
    for(int i = 0; i<=10;i++){
    Coin myCoin = new Coin();
    System.out.println("My coin: "+myCoin.toString());
    if(myCoin.toString() == "Heads"){
      Heads++;
    }else{
      Tails++;
    }
  }
  System.out.println("Heads: " + Heads);
  System.out.println("Tails: " + Tails);

  }
}
