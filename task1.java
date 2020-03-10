import java.util.Scanner;

class computer
{
    Scanner obj = new Scanner(System.in);
    public String state;
    public String boot;
    public String screen;

    public void instant_var()
    {
        System.out.println(state = "state : ON");
        System.out.println(boot = "boot : ON");
        System.out.println(screen = "Screen : ON");
    }


    public void operation() {
        System.out.println("Press Button");
        final char button = obj.next().charAt(0);

        if (button == 'O' && button == 'o') {
            final String open = "Compter turning on";
            System.out.println(open);
        } else if (button == 'S' && button == 's') {
            final String close = "Compter Stutting down";
            System.out.println(close);
        }
    }

    public void print() {
        System.out.println("Print document");
    }

    public void connectivety() {
        System.out.println("Wifi is conected");
    }
}
class task1 {

    public static void main(final String[] args) {
        final computer dell = new computer();
        final computer ibm = new computer();
        final computer hp = new computer();
        System.out.println("dell computers : ");
        dell.instant_var();
        dell.operation();
        dell.print();
        dell.connectivety();
        System.out.println("IBM computers : ");
        ibm.instant_var();
        ibm.operation();
        ibm.print();
        ibm.connectivety();
        System.out.println("Hp computers : ");
        hp.instant_var();
        hp.operation();
        hp.print();
        hp.connectivety();
    }
}
