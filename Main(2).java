import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create a Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // user is prompted to enter the subtotal and gratuity rate
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        // function to calculate the gratuity and total
        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;

        // display the gratuity and total
        System.out.printf("The gratuity is $%.2f and the total is $%.2f%n", gratuity, total);
        // close the scanner
        input.close();
    }
}