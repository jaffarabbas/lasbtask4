import java.util.Scanner;

class DriverExam
{
    Scanner obj = new Scanner(System.in);
    char arr[] = { 'B' , 'A', 'B' , 'C' ,'D', 'B','C' ,'C','A','A' , 'D' ,'B'
         ,'A', 'C', 'A',  'D'
         ,'C' ,'D' , 'D' ,'A'};

    int ques[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

    char attempt[] = new char[20];

    public void passed()
    {
        System.out.println("Enter Your Answer for the folllowing question");

        for(int i = 0 ; i < ques.length;i++)
        {
            System.out.println("Question : "+ques[i]);
        }

        for(int i = 0 ; i < attempt.length;i++)
        {
            System.out.println("Anwer question  : ");
                
            attempt[i]=Character.toUpperCase(obj.next().charAt(0));
           
        
           
            if(attempt[i] != 'A' && attempt[i] !='B' && attempt[i] !='C' && attempt[i] != 'D')
            {   
                System.out.println("Again!!!!!!!!");
                continue;
            }
        }


        for(int i = 0 ; i < attempt.length;i++)
        {
            System.out.println("Anwer are  : "+attempt[i]);
        }


        for(int i = 0 ; i < attempt.length;i++)
        {
           if(attempt[i]==arr[i])
           {
               System.out.println("True");
           }
           else{
            System.out.println("false");
           }
        }
    }


    public void Total_corect()
    {
        int a= 0;  
        for(int i = 0 ; i < attempt.length;i++)
        {
         
           if(attempt[i]==arr[i])
           {
               a++;
           }
           
        }
        System.out.println("Total Correct : "+a);
       
    }

    public void totalIncorrect()
    {
        int a= 0;  
        for(int i = 0 ; i < attempt.length;i++)
        {
         
           if(attempt[i]!=arr[i])
           {
               a++;
           }
           
        }
        System.out.println("Total InCorrect : "+a);
       
    }

    public void miss()
    {
        int check  = 0;
        for(int i = 0 ; i < attempt.length;i++)
        {
            if(attempt[i] != 'A' && attempt[i] !='B' && attempt[i] !='C' && attempt[i] != 'D')
            {   
                check++;
            }
        }
      System.out.println("Total miss : "+check);
    }

    public void result()
    {
        int count=0;
        for(int i = 0 ; i < attempt.length;i++)
        { 
           if(attempt[i]==arr[i])
           {
               count++;
           }
        }
        if(count >=15)
        {
            System.out.println("RESULT : Pass");
        }
        else{
         System.out.println("RESULT : Fail");
        }
        
    }


    public void entr()
    {
        for(int i = 0 ; i < attempt.length;i++)
        {
            System.out.println("Anwer question  : ");
                
            attempt[i]=obj.next().charAt(0);

            
        
        }
    }

}


class evtask3
{
    public static void main(String[] args) {
        DriverExam c = new DriverExam();

        c.passed();

        c.Total_corect();

        c.totalIncorrect();

        c.miss();

        c.result();
    }
}