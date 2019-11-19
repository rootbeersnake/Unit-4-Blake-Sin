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

public class bankPane extends Application{
  private double balance;
  private String accountNumber;
  private String accountName;
  private Label accountNameLabel = new Label("Name: ");
  private TextField accountNameTextField = new TextField();
  private Label testLabel = new Label();
  private Button createAccountButton = new Button("Create Account");
  private Label pinLabel = new Label("PIN: ");
  private TextField pinTextField = new TextField();
  private Label pinLabel2 = new Label("PIN: ");
  private TextField pinTextField2 = new TextField();
  private Label amountLabel = new Label("Amount: ");
  private TextField amountTextField = new TextField();
  private Button deposit = new Button("Deposit");
  private Button interest = new Button("Interest");
  private Button withdraw = new Button("Withdraw");
  private Button viewAcct = new Button("View Acct");
  private TextArea textArea = new TextArea();

  public void start(Stage stage){
    createAccountButton.setOnAction(this::createAccountProcess);

    GridPane container = new GridPane();
    container.add(grid, 0, 0);
    container.add(textArea, 0, 2);

    GridPane grid = new GridPane();
    grid.add(testLabel, 5, 5);
    grid.add(accountNameLabel, 0, 0);
    grid.add(accountNameTextField, 1, 0);
    grid.add(createAccountButton, 0, 2);
    grid.add(pinLabel, 0, 1);
    grid.add(pinTextField, 1, 1);
    grid.add(pinLabel2, 3, 0);
    grid.add(pinTextField2, 4, 0);
    grid.add(amountLabel, 3, 1);
    grid.add(amountTextField, 4, 1);
    grid.add(deposit, 3, 2);
    grid.add(interest, 3, 3);
    grid.add(withdraw, 4, 2);
    grid.add(viewAcct, 4, 3);
    HBox hb = new HBox();
    //hb.getChildren().addAll(testLabel,accountNameLabel,accountNameTextField,createAccountButton,pinLabel,pinTextField,pinLabel2,pinTextField2,amountLabel,amountTextField,deposit,interest,withdraw,viewAcct);
    //grid.setHgap(1);
    FlowPane flow = new FlowPane();
    grid.add(flow, 4, 1);

    //grid.setPrefSize(300, 300);


    grid.setAlignment(Pos.TOP_LEFT);
    //pane.setHgap(20);
    grid.setStyle("-fx-background-color: white");
    //flow.setStyle("-fx-background-color: white");

    Scene scene = new Scene(grid, 900,700);
    stage.setTitle("Bank GUI");
    stage.setScene(scene);
    stage.show();



  }

  private void createAccountProcess(ActionEvent event){
    accountName = accountNameTextField.getText();
    accountNumber = pinTextField.getText();
    testLabel.setText(accountName + accountNumber);
  }

  private void depositProcess(ActionEvent event){
    balance = balance + Integer.parseInt(amountTextField.getText());
    testLabel.setText(testLabel.getText(testLabel) + "/n" + amountTextField.getText);
  }




}
