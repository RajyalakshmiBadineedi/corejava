public class bankAccountProblem {
 int accountNumber;
 String holderName ;
 Double balance;
 bankAccountProblem(int accountNumber,String holderName,Double balance) {
    this.accountNumber=accountNumber;
    this.holderName=holderName;
    this.balance=balance;
 } 
 void display(Double Deposite){
    balance=balance+Deposite;
 }
 void  displayBalance(){
   
   
   System.out.println("Holder name :"+holderName);
   System.out.println("Balance :"+ balance);
   System.out.println("");
   System.out.println("After deposite :");
   this.display(2000.00);
   System.out.println("Balance :"+ balance);
   
 }
 public static void main(String[] args) {
   bankAccountProblem b =new bankAccountProblem(12345, "Lakshmi",5000.00);
   b.displayBalance();
  // b.display(2000.00);

 }
}
