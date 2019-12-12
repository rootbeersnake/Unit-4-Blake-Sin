import java.util.Random;

public class ZombieDiceGreen{
  private int GreenFace;

  public void GreenRoll(){
    Random rand = new Random();
    GreenFace = rand.nextInt(6) + 1;
    if(GreenFace == 6){
      GreenFace = 3;
    }else if(GreenFace == 4 || GreenFace == 5){
      GreenFace = 2;
    }else{
      GreenFace = 1;
    }
  }

  public ZombieDiceGreen(){
    GreenFace = 1;
  }

  public int GreenGetFace() {
    return GreenFace;
  }
}
