
import java.util.Scanner;

class payroll
{
    public int employ_id[]={5658845,4520125,7895122,8777541,8451277,1302850,7580489};
    public int hours[]={12,14,12,15,16,10,8};
    public double payRate[] = {1200,3000.43,1200.22,700,400,1000,5000};
    public double wages[]={432000,1260180.6,540099,336000,340000,300000,1200000};
}

class information
{
    Scanner emp = new Scanner(System.in);
    payroll obj = new payroll();
    
    public void check()
    {
        System.out.print("Enter your employ Number : ");

        int temp =emp.nextInt();

        System.out.printf("Employ %d id is :  %d \n",temp,obj.employ_id[temp]);
        System.out.printf("Employ %d hours are :  %d \n",temp,obj.hours[temp]);
        System.out.printf("Employ %d per Hour rate is :  %.1f \n",temp,obj.payRate[temp]);
        System.out.printf("Employ %d Wages are :  %.1f \n",temp,obj.wages[temp]);

    }
}

class task5
{
    public static void main(String[] args) {
        information inform = new information();

        inform.check();
    }
}