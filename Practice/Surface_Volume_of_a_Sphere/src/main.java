import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String name;
        double surface, volume, radius;
        double pi,liters;

        pi = 3.14159;

        System.out.println("******CALCULATIONS******");
        System.out.println();

        System.out.println("Write your name: ");
        name = sc.nextLine();
        System.out.println();

        System.out.println(name + " write the radius of the sphere (in metres)");
        radius = sc.nextDouble();
        System.out.println();

        surface = 4.0 * pi * radius * radius;
        volume = 4.0 / 3.0 * pi * radius * radius * radius;
        liters = volume * 1000.0;

        System.out.println("The sphere with a radius of " + radius + " meters.");
        System.out.println("\tHas a surface area of " + surface + " square meters");
        System.out.println("\tand a volume of " + volume + " cubic meters, equivalent to " + liters + " liters\n");

        System.out.println("Type exit to quit the program.");
        sc.next("exit");
        System.exit(0);
    }
}
