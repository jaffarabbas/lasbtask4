class one{
    public int x_one;
    two x2;
    
    public one(two t){
      this.x2 = t;
      x_one = 12;
    }
    void display(){
      System.out.println("one varaible is "+x_one);
      x2.display();
      System.out.println("two varaible is "+x2.x_two);
    }
    
    
  }
  
  class two{
    public int x_two;
    three x3;
    
    public two(three w){
      this.x3 = w;
    }
    
    void display(){
      System.out.println("one varaible is "+x_two);
      x3.display();
      System.out.println("three varaible is "+x3.x_three);
    }
  }
  
  class three{
    public int x_three;
    
    three(int x){
      x_three = x;
    }
      
    public void display(){
      System.out.println("the values are three is "+x_three);
      
    }
    
  
  }
  
  
  public class fahadkakam
  {
      public static void main(String[] args) {
    
    three obj3 = new three(8);
    two obj2 = new two(obj3);
    one obj1 = new one(obj2);


           obj1.display();
      }
  }