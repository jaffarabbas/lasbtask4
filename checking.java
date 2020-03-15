/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



class one{
    
    //instance variables
    int x = 11;
    two t;   // class tow's reference
    
    
    //Constructor that recieves two's Constructor
    one(two t){
        
        this.t = t;
        
    }
    
    //methods to display class one and class two variables
    
    void display(){
        
        
        System.out.println("one's x = " +x);
        //call class two's methods
        t.display();
        // access the class two variables
        System.out.println("two's variaable = " +t.y);
    }
    

}
class two{
    //instance variaable 
    int y;
    //initialize y
    two(int y){
        
        this.y = y;
    }
    
    //method to display your
    void display()
    {
        System.out.println("two's y= " +y);
    
    }
    
}

public class checking
{
	public static void main(String[] args) {
	    //create class two's object and then store 22 there
	    two obj2 = new two(22);
	    one obj1 = new one(obj2);
	    
	    //call class one's method
	    obj1.display();
	    
	
	}
}