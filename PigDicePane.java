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
import javafx.scene.layout.VBox;

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
  Dice dice1 = new Dice();
  Dice dice2 = new Dice();
  Adding addScore = new Adding();
  Roll.setOnAction(this::RollMeth);
  Pass.setOnAction(this::changeTurn);

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

if(p1Turn == true){

  P1D1.setText(Integer.toString(dice1.getFace()));
  P1D2.setText(Integer.toString(dice2.getFace()));
}
if(p1Turn == false){
  P2D1.setText(Integer.toString(dice1.getFace()));
  P2D2.setText(Integer.toString(dice2.getFace()));
}

  P1Score.setText("Your Score: " + p1Score);
  P2Score.setText("Your Score: " + p2Score);
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
private void RollMeth(ActionEvent event){
 dice1.roll();
 dice2.roll();
P1Score.setText("Your Score: " + p1Score);
P2Score.setText("Your Score: " + p2Score);
if(dice1.getFace() == 1 || dice2.getFace() == 1){
  if(dice1.getFace() == 1 && dice2.getFace() == 1){
    roundScore = 0;
    P1RoundScore.setText("Round Score: " + roundScore);
    P2RoundScore.setText("Round Score: " + roundScore);
    if(p1Turn == true){
      P1D1.setText("D1: " + Integer.toString(dice1.getFace()));
      P1D2.setText("D2: " + Integer.toString(dice2.getFace()));
      P2D1.setText("D1: 0");
      P2D2.setText("D2: 0");
      p1Score = 0;
      P1Score.setText("Your Score: " + p1Score);
      p1Turn = false;
      CurrentTurn.setText("Player 2 turn");
    }else{
      P2D1.setText("D1: " + Integer.toString(dice1.getFace()));
      P2D2.setText("D2: " + Integer.toString(dice2.getFace()));
      P1D1.setText("D1: 0");
      P1D2.setText("D2: 0");
      p2Score = 0;
      P2Score.setText("Your Score: " + p2Score);
      p1Turn = true;
      CurrentTurn.setText("Player 1 turn");
    }

  }else{
    if(p1Turn == true){
      roundScore = 0;
      P1D1.setText("D1: " + Integer.toString(dice1.getFace()));
      P1D2.setText("D2: " + Integer.toString(dice2.getFace()));
      P1RoundScore.setText("Round Score: " + roundScore);
      P2RoundScore.setText("Round Score: " + roundScore);
      P1Score.setText("Your Score: " + p1Score);
      P2D1.setText("D1: 0");
      P2D2.setText("D2: 0");
      p1Turn = false;
      CurrentTurn.setText("Player 2 Turn");
    }else{
      roundScore = 0;
      P2D1.setText("D1: " + Integer.toString(dice1.getFace()));
      P2D2.setText("D2: " + Integer.toString(dice2.getFace()));
      P1RoundScore.setText("Round Score: " + roundScore);
      P2RoundScore.setText("Round Score: " + roundScore);
      P2Score.setText("Your Score: " + p2Score);
      P1D1.setText("D1: 0");
      P1D2.setText("D2: 0");
      p1Turn = true;
      CurrentTurn.setText("Player 1 Turn");
    }

  }
}else{
  roundScore = roundScore + dice1.getFace() + dice2.getFace();
  if(p1Turn == true){
    P1RoundScore.setText("Round Score: " + roundScore);
    P1D1.setText("D1: " + Integer.toString(dice1.getFace()));
    P1D2.setText("D2: " + Integer.toString(dice2.getFace()));
    P2D1.setText("D1: 0");
    P2D2.setText("D2: 0");
  }else{
    P2RoundScore.setText("Round Score: " + roundScore);
    P2D1.setText("D1: " + Integer.toString(dice1.getFace()));
    P2D2.setText("D2: " + Integer.toString(dice2.getFace()));
    P1D1.setText("D1: 0");
    P1D2.setText("D2: 0");
  }
}
}

//P1D1.setText(Integer.toString(dice1.getFace()));
//P1D2.setText(Integer.toString(dice2.getFace()));

private void changeTurn(ActionEvent event){
  if(p1Turn == true){
    p1Score = p1Score + roundScore;
    P1Score.setText("Your Score: " + p1Score);
    if(p1Score >= 100){
      p1Score = 0;
      p2Score = 0;
      roundScore = 0;
      p1Turn = true;
      CurrentTurn.setText("Player 1 Turn");
      P1Score.setText("Player 1 won");
      P2Score.setText("Your score: 0");
      P1RoundScore.setText("Round Score: 0");
      P2RoundScore.setText("Round Score: 0");
    }else{
    roundScore = 0;
    P1RoundScore.setText("Round Score: " + roundScore);
    P2RoundScore.setText("Round Score: " + roundScore);
    p1Turn = false;
    CurrentTurn.setText("Player 2 Turn");
    P1D1.setText("D1: 0");
    P1D2.setText("D2: 0");
    P2D1.setText("D1: 0");
    P2D2.setText("D2: 0");
    }
  }else{
    p2Score = p2Score + roundScore;
    P2Score.setText("Your Score: " + p2Score);
    if(p2Score >= 100){
      p1Score = 0;
      p2Score = 0;
      roundScore = 0;
      p1Turn = true;
      CurrentTurn.setText("Player 1 Turn");
      P2Score.setText("Player 2 won");
      P1Score.setText("Your score: 0");
      P1RoundScore.setText("Round Score: 0");
      P2RoundScore.setText("Round Score: 0");
    }
    roundScore = 0;
    P1RoundScore.setText("Round Score: " + roundScore);
    P2RoundScore.setText("Round Score: " + roundScore);
    p1Turn = true;
    CurrentTurn.setText("Player 1 Turn");
    P1D1.setText("D1: 0");
    P1D2.setText("D2: 0");
    P2D1.setText("D1: 0");
    P2D2.setText("D2: 0");
  }
}
};
