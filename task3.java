import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Currency Converter");
        System.out.println("1. USD to INR");
        System.out.println("2. INR to USD");
        System.out.println("3. EUR to INR");
        System.out.println("4. INR to EUR");
        System.out.print("Enter your choice: ");
        int choice = Scanner.nextInt();
        System.out.print("Enter amount: ");
        double amount = Scanner.nextDouble();
        double converted;

        if(choice == 1) {
            converted = amount * 83.12; 
            System.out.printf("%.2f USD = %.2f INR%n", amount, converted);
        } else if (choice == 2) {
            converted = amount / 83.12;
            System.out.printf("%.2f INR = %.2f USD%n", amount, converted);
        } else if (choice == 3) {
            converted = amount * 90.25; 
            System.out.printf("%.2f EUR = %.2f INR%n", amount, converted);
        } else if (choice == 4) {
            converted = amount / 90.25;
            System.out.printf("%.2f INR = %.2f EUR%n", amount, converted);
        } else {
            System.out.println("Invalid choice!");
        }

        Scanner.close();
    }
}
