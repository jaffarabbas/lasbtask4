import java.util.Scanner;



import java.util.Random;

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
    public void credit(double amount){
        if(amount < 0){
            CurrentBalance += amount;
            System.out.println("Complete the transaction of account no "+AccountNumber);
        }
        else{
            System.out.println("Error on the amount "+amount+" must be greater than 0");
        }
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


public class task2
{
    public static void main (String[]args)
    {
        Random rng = new Random();
        long UserAcoountNo_1 = (Long) (rng.nextLong() % 100000000000000L) + 5200000000000000L;
        long UserAcoountNo_2 = (Long) (rng.nextLong() % 100000000000000L) + 5200000000000000L;
        long UserAcoountNo_3 = (Long) (rng.nextLong() % 100000000000000L) + 5200000000000000L;

        CustomerAccount User1 = new CustomerAccount("jaffar","hello",UserAcoountNo_1,5000);
        User1.getDetail(1);
        
        CustomerAccount User2 = new CustomerAccount("jaxx","man",UserAcoountNo_2,80000);
        User2.getDetail(2);
        
        CustomerAccount User3 = new CustomerAccount("monmon","can",UserAcoountNo_3,500);
        User3.getDetail(3);
        
        int amount = 7000;
        
        User1.credit(amount);
        User2.withdraw(amount);
        User3.debit(amount);
        
    }
}