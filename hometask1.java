
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


    public void channelUp_down(){
    
        int[] chennel ={1,2,3,4,5,6,7,8,9,10};
        int []temp = new int[10];
        System.out.println("Channel list : ");
        System.out.println("Enter + for up :");

         for(int a =0;a<10;a++)
         {
            for(int i =0;i<10;i++)
            {
             char ch = obj.next().charAt(0);
             if(ch == '+')
             {
                 temp[i] = chennel[a];
                 System.out.println("Channel : "+temp[i]);
                 break;
             }
             else if(ch == '-')
             {
                     
                     if(temp[i] >= 2)
                     {
                     temp[i]--;
                     System.out.println("Channel : "+temp[i]);
                     break;
                     }else{
                         System.out.println("Channel are over");
                     break;
                     }
             }
         }
    }
}



     public void volumeUp_Down()
     {
         do {
                     char a=obj.next().charAt(0);
                     if(a == '+'){             
                     this.volume +=10;
                     System.out.println("Volume : "+this.volume);          
                     }
                     else if(a == '-')
                     {
                         this.volume-=10;
                         System.out.println("Volume : "+this.volume); 
                     }
            
         }while (this.volume >=10 && this.volume<100);
     }
 }

class hometask1
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int ac=10,b=20;
        boolean c = true;
        TV obj = new TV(ac,b,c);
   
        System.out.println("Enter mood what you want :  \n(C for check chennel list)\n(S Set Chennel)\n(U for Chennel Scrolling + for up and - for down)\n(V for Volume scroll + for up and - for down)");
        
        char a = Character.toUpperCase(scn.next().charAt(0));

        switch (a) {
            case 'C':
            obj.channel();
                break;
            case 'S':
            obj.setchennel();
                break;
            case 'U':
            obj.channelUp_down();
                break;
            case 'V':
            obj.volumeUp_Down();
                break;
            default:
            System.out.println("enter again :   ");
            a = Character.toUpperCase(scn.next().charAt(0));
                break;
        }
        scn.close();
    }
}
