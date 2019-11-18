import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Circle extends Application{
    public void start(Stage stage){
      Scene scene = new Scene(new CirclePane(), 500,500);

        stage.setTitle("Circle");
        stage.setScene(scene);
        stage.show();
      }

      public static void main(String[]args){
        launch(args);
      }
    }
