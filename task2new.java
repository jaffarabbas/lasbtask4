import java.util.Random;
import java.util.Scanner;

class CustomerAccount
{
    //Variables

    private String CustomerName;
    private String TypeOfAccount;
    private long AccountNumber;
    private double CurrentBalance;

    //constructor

    public CustomerAccount(String CustomerName,String TypeOfAccount,long AccountNumber,double CurrentBalance)
    {
        this.CustomerName = CustomerName;
        this.TypeOfAccount = TypeOfAccount;
        this.AccountNumber = AccountNumber;
        this.CurrentBalance = CurrentBalance;
    }

    //Methods

    public double debit(double amount){
        if(amount > CurrentBalance){
            amount = amount > 0 ? (amount*-1) : amount;
            CurrentBalance -= amount;
            System.out.println("Complete the transaction of account no "+AccountNumber);
        }
        else {
            System.out.println("Error on the amount your CurrentBalance is less then amount you wants to withdraw " + CurrentBalance + " > " + amount);
        }
        return CurrentBalance;
    }
    public double credit(double amount){
        if(amount < 0){
            CurrentBalance += amount;
            System.out.println("Complete the transaction of account no "+AccountNumber);
        }
        else{
            System.out.println("Error on the amount "+amount+" must be greater than 0");
        }
        return CurrentBalance;
    }
    public void withdraw(double amount){
        if(amount < CurrentBalance){
            amount = amount > 0 ? (amount*-1) : amount;
            CurrentBalance -= amount;
            System.out.println("Complete the transaction of account no "+AccountNumber);
        }
        else{
            System.out.println("Error on the amount your CurrentBalance is less then amount you wants to withdraw "+CurrentBalance+" < "+amount);
        }
    }
    public void getDetail(int no){
        System.out.println("\t\t\tUser No "+no);
        System.out.println("Customer Name is "+CustomerName);
        System.out.println("Type Of Account of Mr."+CustomerName+" is "+TypeOfAccount);
        System.out.println("Account Number of Mr."+CustomerName+" is "+AccountNumber);
        System.out.println("Current Balance of Account Number is "+AccountNumber+" is "+CurrentBalance+"\n");
    }



}


public class task2new
{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int i;

System.out.print("Enter the number of user you have:");
int j=scan.nextInt();



for(i=0; i<j; i++){
      System.out.println("\n\t\t\t\t\t\tEnter information for User no "+i+"\n");
      System.out.print("Enter the Account number:");
            
            System.out.print("For Credit operation press C , For debit D and for withdraw W");
            char method = Character.toUpperCase(scan.next().charAt(0));
            System.out.print("Enter the amount you wants to perform:");
            double amount = scan.nextInt();
            
            String a=scan.next();
            String b=scan.next();
            long c=scan.nextLong();
            double d=scan.nextDouble();
            
           CustomerAccount[] n = new CustomerAccount[j];
           
           n[i]= new CustomerAccount(a,b,c,d);
           
           if(method=='C'){
               n[i].credit(amount);
               n[i].getDetail(i);
           }
           else if(method=='D'){
               n[i].debit(amount);
               n[i].getDetail(i);
           }
           else if(method=='W'){
               n[i].withdraw(amount);
               n[i].getDetail(i);
           }
           scan.close();
   }
}
}
