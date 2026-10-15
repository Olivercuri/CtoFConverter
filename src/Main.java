import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double celsius = 0;
        String trash;
        boolean done = false;

        do {
            System.out.print("Enter temperature in Celsius: ");

            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid number.");
            }
        } while (!done);

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.printf("Temperature in Fahrenheit: %.2f%n", fahrenheit);
    }
}