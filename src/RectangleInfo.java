import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double width = 0;
        double height = 0;
        String trash;
        boolean done;

        // Get width
        done = false;
        do {
            System.out.print("Enter rectangle width: ");

            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();

                if (width > 0) {
                    done = true;
                } else {
                    System.out.println("Width must be greater than zero.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a number.");
            }
        } while (!done);

        // Get height
        done = false;
        do {
            System.out.print("Enter rectangle height: ");

            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();

                if (height > 0) {
                    done = true;
                } else {
                    System.out.println("Height must be greater than zero.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a number.");
            }
        } while (!done);

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(width * width + height * height);

        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Perimeter: %.2f%n", perimeter);
        System.out.printf("Diagonal: %.2f%n", diagonal);
    }
}
