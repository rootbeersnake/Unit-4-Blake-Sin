import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;


public class CirclePane extends GridPane{
  private TextField radius;
  private Circle circle;

  public void Circle(){
    Font font = new Font(20);
    Label inputLabel = new Label("Radius: ");
    inputLabel.setFont(font);
    GridPane.setHalignment(inputLabel,HPos.RIGHT);

    radius = new TextField();

    radius.setFont(font);
    radius.setPrefWidth(70);
    radius.setAlignment(Pos.CENTER);
    radius.setOnAction(this::processReturn);

   circle = new Circle();
    circle.setRadius(70);
    circle.setCenterX(100);
    circle.setCenterY(100);

    setAlignment(Pos.CENTER);
    setHgap(20);
    setVgap(10);
    setStyle("-fx-background-color: orange");

    add(inputLabel, 0, 0);
    add(radius, 1, 0);

  }

    public void processReturn(ActionEvent event){
      double Radius = Double.parseDouble(radius.getText());
      circle.setRadius(Radius);
    }
  }
