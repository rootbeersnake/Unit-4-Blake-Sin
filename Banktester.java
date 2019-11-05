

public class Banktester{
  public static void main(String[] args){
    Bank myBank = new Bank();
    myBank.setAccount("Blake", 1234, 200.00);
    myBank.getAccount();
    myBank.deposit(200.00);
    myBank.withdraw(300.00);
    //Time in years
    myBank.applyInterest(75);
    myBank.getAccount();
  }
}
