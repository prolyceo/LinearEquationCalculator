import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome");

        System.out.print("Enter the first x coordinate: ");
        double x1 = input.nextDouble();
        input.nextLine();

        System.out.print("Enter the first y coordinate: ");
        double y1 = input.nextDouble();
        input.nextLine();

        System.out.print("Enter the second x coordinate: ");
        double x2 = input.nextDouble();
        input.nextLine();

        System.out.print("Enter the second y coordinate: ");
        double y2 = input.nextDouble();
        input.nextLine();

        if (x1 == x2) {
            System.out.println("These points are on a vertical line: x = " + x1);
            System.exit(0);
        }

        LinearEquation thisEq = new LinearEquation(x1, x2, y1, y2);

        System.out.println(thisEq.twoPoints());
        System.out.println(thisEq.lineEquation());
        System.out.println(thisEq.slopeString());
        System.out.println(thisEq.yIntString());
        System.out.println(thisEq.distanceString());

        System.out.print("Enter any value for x: ");
        double x = input.nextDouble();
        input.nextLine();

        System.out.println(thisEq.calculatePointString(x));

        input.close();
    }
}
