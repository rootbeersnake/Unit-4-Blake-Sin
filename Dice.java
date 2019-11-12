import java.util.Random;

public class Dice {

    private int Face;

    public void roll(){
        Random rand = new Random();
        Face = rand.nextInt(6)+1;
    }

    public Dice(){
        Face = 1;
    }

    public int getFace() {
        return Face;
    }

    public String toString(){
        String result = "Face value = " + Face;
        return result;
    }
}
