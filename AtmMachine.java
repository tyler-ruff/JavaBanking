import java.util.ArrayList;

public class AtmMachine{
  public static double balance = 0;
  public static ArrayList<Transaction> transactionList = new ArrayList<Transaction>();

  public static void balance(){
    System.out.printf("Balance: $%S", AtmMachine.balance);
  }
  public static void withdrawal(double amount){
    try {
      Transaction transaction = new Transaction();
      //check for overdraft
      if(AtmMachine.balance >= amount){
        AtmMachine.balance -= amount;
        transaction.set(amount, '-');
      } else {
        System.out.println("Error: insufficient funds.");
        transaction.set(amount, '/');
      }
      AtmMachine.transactionList.add(transaction);
    } catch (Exception e){
      e.printStackTrace();
    }
  }
  public static void deposit(double amount){
    try{
      Transaction transaction = new Transaction();
      if(amount >= 0){
        AtmMachine.balance += amount;
        transaction.set(amount, '+');
      } else {
        System.out.println("Error: non-zero deposit value.");
        transaction.set(amount, 'N');
      }
      AtmMachine.transactionList.add(transaction);
    } catch (Exception e){
      e.printStackTrace();
    }
  }
}