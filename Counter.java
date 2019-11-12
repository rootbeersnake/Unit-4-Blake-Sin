import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class Counter extends Application {
  private int count;
  private Text countText;

public void start(Stage stage){
    count = 50;
    countText = new Text("Current count: 50");

    Button add = new Button("push to add");
    add.setOnAction(this::addCount);
    Button decrease = new Button("push to decrease");
    decrease.setOnAction(this::decreaseCount);
    FlowPane pane = new FlowPane(add, decrease, countText);
    pane.setAlignment(Pos.CENTER);
    pane.setHgap(20.0);
    pane.setStyle("-fx-background-color: yellow");
    Scene scene = new Scene(pane, 300, 100);
    stage.setTitle("Counter");
    stage.setScene(scene);
    stage.show();
  }

  private void addCount(ActionEvent event){
    count++;
    countText.setText("Current count: " + count);
  }

  private void decreaseCount(ActionEvent event){
    count--;
    countText.setText("Current count: " + count);
    }
}
