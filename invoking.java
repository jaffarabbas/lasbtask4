
class one
{
    int var1=23;
    two var2;

    one( two var2) {
        this.var2 = var2;
    }

    void dis()
{
    var2.dis();
    System.out.println("value of object 1 frm 2: "+var2.var2);
}

}

class two {
    int var2=43;
    three var3;

    two(three var3) {
        this.var3 = var3;
    }


void dis()
{
    System.out.println("value of object 2 : "+var2);
}

    void display()
{
    var3.display();
    System.out.println("value of object 2 from 3 : "+var3.var3);
}
 }

class three {
    int var3;

    three(int var3) {
        this.var3 = var3;
    }
    void display()
{
    System.out.println("value of object 3 : "+var3);
}

}



class invoking
{
    public static void main( String[] args) {
        three obj3 = new three(222);
        two obj2 = new two(obj3);
        one obj = new one(obj2);


        obj2.display();
        obj.dis();
    }
}