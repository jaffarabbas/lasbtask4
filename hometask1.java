
import java.util.Scanner;

class TV
{
    Scanner obj = new Scanner(System.in);
    
    private int channel;
    private int volume;
    private Boolean state;

    //getter setter 

    public void getC(int channel)
    {
         this.channel=channel;
    }
    public void getv(int volume)
    {
        this.volume=volume;
    }

    public void gets(Boolean state)
    {
        this.state=state;
    }

    public int setC()
    {
        return  this.channel;
    }

    public int setv()
    {
        return this.volume;
    }

    public boolean sets()
    {
        return this.state;
    }

    TV(int chennel,int vol,Boolean stat)
    {
           this.channel = chennel;
           this.volume =vol;
           this.state = stat;
           turnon();
           System.out.println("Chennel no : "+this.channel+"\nvolume : "+this.volume+"\nstate : "+this.state);
    }



   // public int[] chennel ={1,2,3,4,5,6,7,8,9,10};
    public void channel()
    {
         int[] chennel ={1,2,3,4,5,6,7,8,9,10};
         System.out.println("Channel list : ");

         for(int a : chennel)
         {
             System.out.println("Chennal "+a);
         }
    }

    public void setchennel()
    {
        channel();
        int[] chennel ={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Set channel : ");
        int[] arr = new int[10];
        int[] temp = new int[10];

        for(int i =0;i<arr.length;i++)
        {
            System.out.printf("Set on Chennel %d : ",i+1);
            arr[i]=obj.nextInt();

            temp[i] = arr[i];

            chennel[i] = temp[i];
        }


        for(int i =0;i<arr.length;i++)
        {
            System.out.println("Seted channel :  "+chennel[i]+" at position : "+(i+1));
        } 
    }


   public boolean turnon()
    {
          this.state = true;
          System.out.println("Your Tv is turn On: ");
          return this.state;
    }

    public boolean turnoff()
    {
          this.state = false;
          System.out.println("Your Tv is turn Off: ");
          return this.state;
    }



    public void checkstate()
    {
        
    }


    
}


class hometask1
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Press O to open and C to close");
        char a = scn.next().charAt(0);
        if(a == 'O')
        {
            char b[]={'t','r','u','e'};
            for(int i:b)
            {
                System.out.println(b[i]);
            }
        }
        else if(a=='C'){
            char b[]={'f','a','l','s','e'};
            for(int i:b)
            {
                System.out.println(b[i]);
            }
        }
        int ac=10,b=20;
        
        TV obj = new TV(ac,b,c);
   
        
        obj.checkstate();
        obj.setchennel();
    }
}