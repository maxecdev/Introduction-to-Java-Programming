import java.util.Scanner;

public class Main {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        double r, area, perimeter;

        System.out.println ("CIRCUMFERENCE CALCULATIONS");
        System.out.println ("------------- ------------");
        System.out.println ();

        System.out.print ("Please enter radius in cm. ");
        r = sc.nextDouble();

        System.out.println("\nA circumference of radius "+r+" cm.");

        perimeter = (2*3.1415927)*r;
        System.out.println("\thas a perimeter of "+perimeter+" cm.");

        area = 3.1415927*(r*r);
        System.out.println("\tand an area of "+area+" square cm .");

        System.out.print("\nPlease press any key to exit");
        sc.nextLine();
        System.exit(0); // terminate
    }
}
