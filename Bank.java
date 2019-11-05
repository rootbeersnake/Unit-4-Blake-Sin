import java.text.DecimalFormat;



public class Bank{

private final double INTEREST = 1.0185;
private double balance = 0;
private String Name = "";
private int accountNumber = 1;
DecimalFormat format = new DecimalFormat("#############.##");

public void setAccount(String name, int accountnumber, double currentMoney){
  balance = currentMoney;
  accountNumber = accountnumber;
  Name = name;
}

public void getAccount(){
  System.out.println("Account name: "+ Name);
  System.out.println("Account #:" + accountNumber);
  System.out.println("Balance: $" + format.format(balance));
}

public void withdraw(double moneyRemoved){
  balance = balance - moneyRemoved;
  System.out.println("withdrew $" + moneyRemoved);
  System.out.println("New balance: $" + balance);
}

public void deposit(double moneyAdded){
  balance = balance + moneyAdded;
  System.out.println("Added $" + moneyAdded);
  System.out.println("New balance: $" + balance);
}

public void applyInterest(double time){
  double newBalance = balance;
  if(time >= 1){
    for(int i = 0; i < time; i++){
      newBalance = newBalance * INTEREST;
    }
    System.out.println("Added $" + format.format(newBalance - balance) + " in interest");
    balance = newBalance;
  }else{
    System.out.println("Leave your money in for a year to compund");
  }
}







}
