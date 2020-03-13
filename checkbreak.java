
import java.util.Scanner;


class checkbreak{
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);


        int a=obj.nextInt();

        char arr[] = new char[a];

        boolean loop = true;

       while(loop)
       {
           int i=0;
           arr[i]=obj.next().charAt(0);
           if(arr[i] == ' ')
           {
               System.out.println("jsdhf");
           }
           else if(arr[i] != 'A' && arr[i] !='B' && arr[i] !='C' && arr[i] != 'D')
           {
            System.out.println("hello");
           }
       }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }



        obj.close();


    }
}