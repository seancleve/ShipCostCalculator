import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
        double itemPrice;
        final double FREE_SHIP = 100;
        double shipCost;
        double totalCost;
        final double SHIP_RATE = .02;
        String trash = "";

        System.out.println("Enter the item price: ");
        if(in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine();

            if(itemPrice >= FREE_SHIP)
            {
                shipCost = 0;
                totalCost = itemPrice;
            }
            else
            {
                shipCost = SHIP_RATE * itemPrice;
                totalCost = itemPrice + shipCost;

            }
            System.out.println("Shipping cost is: " + shipCost);
            System.out.println("Total cost is: " + totalCost);
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number!");
            System.out.println("Run the program again with correct input!");
        }
    }
}