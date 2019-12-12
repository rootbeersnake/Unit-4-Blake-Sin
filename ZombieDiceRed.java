import java.util.Random;

public class ZombieDiceRed{
  private int RedFace;
  //private boolean brain = false;
  //private boolean foot = false;
  //private boolean shotgun = false;

  public void RedRoll(){
    Random rand = new Random();
    RedFace = rand.nextInt(6) + 1;
    if(RedFace == 6){
      RedFace = 1;
    }else if(RedFace == 4 || RedFace == 5){
      RedFace = 2;
    }else{
      RedFace = 3;
    }
  }

  public ZombieDiceRed(){
    RedFace = 1;
  }

  public int RedGetFace() {
    return RedFace;
  }
}
