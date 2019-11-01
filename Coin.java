/*
this is  the coin class
it is the blue print to make a coin object
*/

public class Coin{
  //These are the declarations for the attributes (instance variables) of a coin
  private int Face;
  //constants defining heads and tails
  private final int Heads = 0;
  private final int Tails = 1;

  /*
  the coin constructor that defines what happens when a coin object is made
  when a new coin is made it gets flipped
  */

  public Coin(){
      flip();
  }

  /*
  this is the section of the class containing the methods (behaviors) of a coin

  the flip method assigns a randomly chosen value to the face of the coin
  */

  public void flip(){
    Face = (int) (Math.random() * 2);
  }
  /*
  the isHeads method tells us if the coins's face is heads or not
  */
  public boolean isHeads(){
    return (Face == Heads);
  }

  /*
  The accessor method for the face variable (a getter)
  */

  public int getFace(){
    return Face;
  }

  /*
  the mutator/modifier method for the face variable (a setter)
  */

  public void setFace((int) newFace){
    Face = newFace;
  }

  /*
  prints out the current information about the state of a coin
  */
  public String toString(){
    String result = "";
    if(Face == Heads){
      result = "Heads";
    }else{
      result = "Tails";
    }
    return result;
  }


}
