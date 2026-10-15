import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double gallons = 0;
        double mpg = 0;
        double price = 0;
        String trash;
        boolean done;

        // Get gallons of gas
        done = false;
        do {
            System.out.print("Enter gallons of gas in the tank: ");

            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();

                if (gallons >= 0) {
                    done = true;
                } else {
                    System.out.println("Gallons cannot be negative.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a number.");
            }
        } while (!done);

        // Get fuel efficiency
        done = false;
        do {
            System.out.print("Enter fuel efficiency (MPG): ");

            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine();

                if (mpg > 0) {
                    done = true;
                } else {
                    System.out.println("MPG must be greater than zero.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a number.");
            }
        } while (!done);

        // Get gas price
        done = false;
        do {
            System.out.print("Enter price of gas per gallon: ");

            if (in.hasNextDouble()) {
                price = in.nextDouble();
                in.nextLine();

                if (price >= 0) {
                    done = true;
                } else {
                    System.out.println("Price cannot be negative.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a number.");
            }
        } while (!done);

        double cost100Miles = (100.0 / mpg) * price;
        double distance = gallons * mpg;

        System.out.printf("Cost to drive 100 miles: $%.2f%n", cost100Miles);
        System.out.printf("Distance with a full tank: %.2f miles%n", distance);
    }
}

