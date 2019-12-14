import java.util.Random;

public class ZombieDiceYellow{
  private Integer YellowFace;

  public void YellowRoll(){
    Random rand = new Random();
    YellowFace = rand.nextInt(6) + 1;
    if(YellowFace == 6 || YellowFace == 1){
      YellowFace = 1;
    }else if(YellowFace == 4 || YellowFace == 5){
      YellowFace = 2;
    }else{
      YellowFace = 3;
    }
  }

  public ZombieDiceYellow(){
    YellowFace = 1;
  }

  public Integer YellowGetFace() {
    return YellowFace;
  }
}
