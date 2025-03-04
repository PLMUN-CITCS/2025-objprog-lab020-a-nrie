import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int userChoice = 0;
        while (userChoice != 3) {
            displayMenu();
            System.out.print("Enter your choice (1-3): ");
            userChoice = userInput.nextInt();
            handleMenuChoice(userChoice, userInput);
        }   
        userInput.close(); // Close scanner after exiting the loop
    }

    public static void displayMenu() {
        System.out.println("Menu: \n1. Greet User \n2. Check Even/Odd \n3.Exit");
    }

    public static void handleMenuChoice(int choice, Scanner scanner) {
        if (choice == 1) {
            greetUser();
        } else if (choice == 2) {
            checkEvenOrOdd(scanner);
        } else if (choice == 3) {
            System.out.println("Exiting Program: Goodbye!");
        } else {
            System.out.println("Invalid Choice");
        }
    }

    public static void checkEvenOrOdd(Scanner scanner) {
        int num = getIntegerInput(scanner); // Get the number
        checkEvenOrOddHandle(num); // Check the number
    }

    public static int getIntegerInput(Scanner scanner) {
        System.out.print("Enter an integer: ");
        return scanner.nextInt();
    }

    public static void checkEvenOrOddHandle(int intNum) {
        if (intNum % 2 == 0) {
            System.out.println(intNum + " is an Even number.");
        } else {
            System.out.println(intNum + " is an Odd number.");
        }
    }

    public static void greetUser() {
        System.out.println("Hello!");
    }
}
