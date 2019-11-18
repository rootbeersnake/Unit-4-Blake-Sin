import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.HPos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.layout.HBox;

public class bankPane extends Application{
  private double balance;
  private double interest;
  private String acountNumber;

  public void start(Stage stage){
    Label balanceLabel = new Label("Balance: ");
    TextField balanceTextField = new TextField();
    HBox hb = new HBox();
    hb.getChildren().addAll(balanceLabel, balanceTextField);
    hb.setSpacing(10);

    FlowPane pane = new FlowPane(hb);
    pane.setAlignment(Pos.CENTER);
    pane.setHgap(20);
    pane.setStyle("-fx-background-color: blue");

    Scene scene = new Scene(pane, 300,100);
    stage.setTitle("Bank GUI");
    stage.setScene(scene);
    stage.show();


  }




}
