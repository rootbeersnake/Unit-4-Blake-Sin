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
import javafx.scene.control.TextInputControl;
import javafx.scene.control.TextArea;
import java.text.DecimalFormat;

public class PigDicePane extends Application{

  int answer = 5;
  int p1Score = 0;
  int p2Score = 0;
  boolean p1Turn = true;
  int roundScore = 0;
  Dice dice1 = new Dice();
  Dice dice2 = new Dice();
  private Label P1D1;
  private Label P1D2;
  private Label P2D1;
  private Label P2D2;
  private Label P1Score;
  private Label P2Score;
  private Label P1RoundScore;
  private Label P2RoundScore;
  private Button Roll;
  private Button Pass;
  private Label CurrentTurn;
  private GridPane grid = new GridPane();



public void start(Stage stage){

  Roll.setOnAction(this::updateText);
  Pass.setOnAction(this::updateText);
  //Roll.setOnAction(this::);

  P1D1 = new Label("D1: 0");
  P1D2 = new Label("D2: 0");
  P2D1 = new Label("D1: 0");
  P2D2 = new Label("D2: 0");
  P1Score = new Label("Your Score: 0");
  P2Score = new Label("Your Score: 0");
  P1RoundScore = new Label("Round Score: 0");
  P2RoundScore = new Label("Round Score: 0");
  Roll = new Button("Roll");
  Pass = new Button("Pass");
  CurrentTurn = new Label("Player 1 Turn");

  grid.setAlignment(Pos.TOP_LEFT);
  grid.setStyle("-fx-background-color: white");
  grid.setHgap(10);
  grid.setVgap(5);

  grid.add(P1D1, 0, 0);
  grid.add(P1D2, 1, 0);
  grid.add(P2D1, 0, 1);
  grid.add(P2D2, 1, 1);
  grid.add(P1Score, 2, 0);
  grid.add(P2Score, 2, 1);
  grid.add(P1RoundScore, 3, 0);
  grid.add(P2RoundScore, 3, 1);
  grid.add(Roll, 0, 2);
  grid.add(Pass, 1, 2);
  grid.add(CurrentTurn, 2, 3);

      Scene scene = new Scene(grid, 400,300);
      stage.setTitle("Die GUI");
      stage.setScene(scene);
      stage.show();

    };


private void updateText(ActionEvent event){

  //dice1.getFace().toString(int)
  //Integer.toString(dice1.getFace())

if(p1turn == true){
  P1D1.setText(Integer.toString(dice1.getFace()));
  P1D2.setText(Integer.toString(dice1.getFace()));
}
if(p1turn == false){
  P2D1.setText(Integer.toString(dice1.getFace()));
  P2D2.setText(Integer.toString(dice1.getFace()));
}

  P1Score.setText("Your Score: " + P1Score);
  P2Score.setText("Your Score: " + P2Score);
  if(p1Turn == true){
    P1RoundScore.setText("Round Score: " + roundScore);
    P2RoundScore.setText("Round Score: --");
    CurrentTurn.setText("Player 1 Turn");
  }else{
    P1RoundScore.setText("Round Score: --");
    P2RoundScore.setText("Round Score: " + roundScore);
    CurrentTurn.setText("Player 2 Turn");
  }

};
//private void RollMeth(ActionEvent event){
//  if()
//}
};
