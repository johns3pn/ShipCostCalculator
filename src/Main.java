//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Declare variables
        // Prompt user for item price
        // Read item price
        // If item price is 100 or more shipping is free
        // Otherwise shipping is 2% of item price
        // Calculate total price
        // Display shipping cost
        // Display total price

        Scanner in = new Scanner(System.in);

        double itemPrice;
        double shippingCost;
        double totalPrice;

        System.out.print("Enter item price: ");

        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine();

            if (itemPrice >= 100) {
                shippingCost = 0;
            } else {
                shippingCost = itemPrice * 0.02;
            }

            totalPrice = itemPrice + shippingCost;

            System.out.println("Shipping Cost: $" + shippingCost);
            System.out.println("Total Price: $" + totalPrice);
        } else {
            System.out.println("Invalid input.");
        }
    }
}
