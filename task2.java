import java.util.Scanner;

class CustomerAccount
{
       Scanner obj = new Scanner(System.in);
       public String CustomerName;
       public String TypeOfAccount;
       private String AccountNumber;
       private double CurrentBalance;

       public void information()
       {
           System.out.println("Enter Your Name");
           CustomerName = obj.next(); 
           System.out.println("Enter Type of Account: ");
           TypeOfAccount = obj.next();   
           set();
           setBalance();      
       }
       void get(String AccountNumber)
       {
           this.AccountNumber = AccountNumber;
       }
       
       String set()
       {
           System.out.println("Enter Account number :");
           AccountNumber = obj.next();
           return AccountNumber;
       }

       void getBalance(double CurrentBalance)
       {
           this.CurrentBalance = CurrentBalance;
       }
       
       double setBalance()
       {
           System.out.println("Your Curent Balance:");
           CurrentBalance = 21000;
           return CurrentBalance;
       }

       public void show_result()
       {
           System.out.println("\n");
           System.out.println("Name : "+CustomerName);
           System.out.println("Account Type : "+TypeOfAccount);
           System.out.println("Account : "+AccountNumber);
           System.out.println("Your Balance : "+CurrentBalance);
       }

       public void debit()
       {
System.out.println("dsf");
       }

       public void credit()
       {
        System.out.println("dsf");
       }

       private void withdraw()
       {
        System.out.println("dsf");
       }
}
class task2
{
    public static void main(String[] args) {
        CustomerAccount obj = new CustomerAccount();
        obj.information();
        obj.show_result();
    }
}