import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int a, b, c, result;

        System.out.println("***OPERATIONS***");

        System.out.print("\nHello. Please write your name: ");
        name = sc.nextLine();

        System.out.println("Well " + name + ", I need three integer numbers...");

        System.out.print("\nPlease enter first number (a): ");
        a = sc.nextInt();
        System.out.print("Please enter second number (b): ");
        b = sc.nextInt();
        System.out.print("Please enter the third number (c):");
        c = sc.nextInt();

        System.out.println("\n" + name + ", these are the results of some computations that I have performed for you:");

        result = a+b-c;
        System.out.println("\n" + a + " + " + b + " - " + c + " = " + result);
        result = (a*b)/c;
        System.out.println("(" + a + " · " + b + ") / " + c + " = " + result);
        result = a*(b+c);
        System.out.println(a+" · (" + b + " + " + c + ") = " + result);

        System.out.print("\nGoodbye " + name + ", press any key to exit.");
        sc.nextLine();
        System.exit(0);
    }
}