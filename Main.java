import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> optionList = new ArrayList<String>();
    optionList.add("Deposit"); optionList.add("Withdraw");
    optionList.add("Show Balance"); optionList.add("Show History"); optionList.add("Quit");
    System.out.println("Welcome to ATM.");
    Scanner userInput = new Scanner(System.in);
    Object[] menu = optionList.toArray();
    boolean systemLoop = true;
    while(systemLoop){
          System.out.println("#");
          System.out.println("#");
          for(int i = 0, j = 1; i < 5; i++, j++){
            System.out.printf("[%s] \t %s\n", String.valueOf(j), (String)menu[i]);
          }
          System.out.println("#");
          System.out.println("#");
          System.out.println("Please enter a choice: [#1-5]:");
          int entry = userInput.nextInt();
          switch(entry){
            case 0:
              continue;
            case 1:
              System.out.println("Amount to deposit: [$.]:");
              double cashAmount = userInput.nextDouble();
              AtmMachine.deposit(cashAmount);
              continue;
            case 2:
              System.out.println("Amount to withdraw: [$.]:");
              double amount = userInput.nextDouble();
              AtmMachine.withdrawal(amount);
              continue;
            case 3:
              AtmMachine.balance();
              System.out.println("#");
              continue;
            case 4:
              //transaction history
              continue;
            case 5:
            default:
              userInput.close();
              systemLoop = false;
            
          }
    }


      
    }
    
    
    
}