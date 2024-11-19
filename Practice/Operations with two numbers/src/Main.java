import java.util.Scanner;

public class Main {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2;
        int add, substraction, multiplication, division;

        System.out.println ("***-Basic arithmetic operations-***");
        System.out.println ();

        System.out.print ("Please enter first number: ");
        n1 = sc.nextInt();

        System.out.print("Please enter second number: ");
        n2 = sc.nextInt();
        System.out.println();

        add= n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + add);

        substraction = n1 - n2;
        System.out.println(n1 + " - " + n2 + " = " + substraction);
        substraction = n2 - n1;
        System.out.println(n2 + " - " + n1 + " = " + substraction);

        multiplication = n1 * n2;
        System.out.println(n1 + " x " + n2 + " = " + multiplication);

        division = n1 / n2;
        System.out.println(n1 + " / " + n2 + " = " + division);
        division = n2 / n1;
        System.out.println(n2 + " / " + n1 + " = " + division + "\n");

        System.out.print("Press any key to exit.");
        sc.nextLine();
        System.exit(0);
    }
}