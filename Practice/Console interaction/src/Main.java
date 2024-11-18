import java.util.Scanner;

public class Main {

    public static void main (String [] args) {
        String name, place, father, mother;
        Scanner sc = new Scanner(System.in);

        System.out.println("***User Questionnaire***");

        System.out.print("What's your name? ");
        name = sc.nextLine();

        System.out.print("Where do you live "+name+" ? ");
        place = sc.nextLine();

        System.out.print("What's your father's name? ");
        father = sc.nextLine();

        System.out.print("and your mother's name? ");
        mother = sc.nextLine();

        System.out.println("Pleased to meet you "+name+" from "+place+" son of "+father+" and "+mother);

        System.out.print("Press any key to exit.");
        sc.nextLine();
        System.exit(0);
    }
}