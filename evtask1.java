
import java.util.Scanner;

class RetailItem
{
     private String description;
     private int unitsOnHand;
     private double price;
     
     void getDesciption(String description)
     {
        this.description=description;
     }

     String setDesciption()
     {
         return description;
     }
     
     void getUnitsOnHand(int unitsOnHand)
     {
        this.unitsOnHand=unitsOnHand;
     }

     int setUnitsOnHand()
     {
         return unitsOnHand;
     }
     

     void getPrice(double price)
     {
        this.price=price;
     }

     double setPrice()
     {
         return price;
     }
     
     
     RetailItem(String description,int unitsOnHand,double price)
     {
        this.description = description;
        this.unitsOnHand =unitsOnHand;
        this.price = price;
     }

}

class che
{
    Scanner scn = new Scanner(System.in);
    public String d;
    public int b;
    public double c;
    RetailItem obj =new RetailItem(d,b,c);

    public void reading_information()
    {
        System.out.println("Enter product: ");
        d=scn.next();
        System.out.println("Enter Unit Quantity: ");
        b=scn.nextInt();
        System.out.println("Enter Price: ");
        c=scn.nextDouble();
    }

    public void display_information()
    {

        System.out.println("Your Product : "+d);
        System.out.println("Product Quantity : "+b);
        System.out.println("Product Price : "+c);
    }
}

class evtask1
{
    public static void main(String[] args) {
        che obj1 = new che();
        che obj2 = new che();
        che obj3 = new che();

        obj1.reading_information();
        obj2.reading_information();
        obj3.reading_information();


        obj1.display_information();
        obj2.display_information();
        obj3.display_information();
        
    }
}