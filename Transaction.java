public class Transaction{

  public boolean status;
  public double amount;
  public TransactionType type;
  
  public Transaction() {
    this.amount = 0;
    this.type = TransactionType.HOLD;
    this.status = false;
  }
  public boolean set(double amount, char transactionType){
    boolean result = false;
    if(this.status == false){
        this.amount = amount;
        switch(transactionType){
          case '-':
            this.type = TransactionType.WITHDRAW;
            this.status = true;
            result = true;
            break;
          case '+':
            this.type = TransactionType.DEPOSIT;
            this.status = true;
            result = true;
            break;
          case '?':
            this.type = TransactionType.INQUIRY;
            this.status = true;
            result = true;
          case '/':
          case 'N':
            this.type = TransactionType.ERROR;
            this.status = true;
          default:
            this.type = TransactionType.HOLD;
            this.status = true;
            break;
        }
      } 
    return result;
  }
  public String toString(){
    String result = "";
    if(this.status == true){
      result = "$" + String.valueOf(this.amount) + "/" + type.toString();
    }
     return result;
  }
  
}