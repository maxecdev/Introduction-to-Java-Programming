import java.util.Scanner;

public class Converter {

    public static void main(String[] args){
        double Mb, Gb;

        System.out.println("---Gb to Mb Converter---");
        System.out.print("Enter the amount of gigabytes : ");

        Scanner sc = new Scanner(System.in);
        Gb = sc.nextDouble();

        Mb = Gb * 1024;

        System.out.println("\n" + Gb + " Gb is " + Mb + " Mb");
        sc.close();
    }
}