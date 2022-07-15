import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth:");
        boolean hasNextInt = scanner.hasNextInt(); //zabezpieczenie przed wpisaniem liter zamiast liczb
        if (hasNextInt) {
            int birth = scanner.nextInt();
            scanner.nextLine(); //handle enter key
            System.out.println("Enter your name:");
            String name = scanner.nextLine();
            System.out.println("Your name is " + name);
            System.out.println("You're " + (2022-birth) +" years old");
        }
        else
            System.out.println("Error invalid age");
        scanner.close();
    }
}