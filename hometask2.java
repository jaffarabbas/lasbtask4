import java.util.Scanner;

class stock
{
    public String symbol;
    public String name; 
    public double previousClosingPrice;
    public double currentPrice;


    stock(String symbol,String name,double previousClosingPrice,double currentPrice)
    {
          this.symbol = symbol;
          this.name = name;
          this.previousClosingPrice = previousClosingPrice;
          this.currentPrice = currentPrice;

          System.out.println("Symbol : "+this.symbol+"\nName : "+this.name+"\nOld Price : "+this.previousClosingPrice+"\nToday Price : "+this.currentPrice);
    }

    public void ChangePercentage()
    {
        double total = this.previousClosingPrice - this.currentPrice;
        double per = total/(this.previousClosingPrice + this.currentPrice)*100;
        System.out.println(per);
    }
}

class hometask2
{
    public static void main(String[] args) {   
        Scanner obj = new Scanner(System.in);
        System.out.println("Your Symbol : ");
        String a =obj.next();
        System.out.println("Your name : ");
        String b =obj.next();
        System.out.println("Your old price : ");
        double c =obj.nextDouble();
        System.out.println("Your current price : ");
        double d =obj.nextDouble();

        stock cl = new stock(a,b,c,d);

        cl.ChangePercentage();
    }
}