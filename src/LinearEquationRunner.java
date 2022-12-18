import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome");

        System.out.print("Enter the first coordinate pair (x,y): ");
        String coord1str = input.nextLine();

        System.out.print("Enter the second coordinate pair (x,y): ");
        String coord2str = input.nextLine();

        /* System.out.print("Enter the second x coordinate: ");
        double x2 = input.nextDouble();
        input.nextLine();

        System.out.print("Enter the second y coordinate: ");
        double y2 = input.nextDouble();
        input.nextLine(); */

        int comma1 = coord1str.indexOf(",");
        int comma2 = coord2str.indexOf(",");

        double x1 = Double.valueOf(coord1str.substring(1,comma1));
        double y1 = Double.valueOf(coord1str.substring(comma1 + 1, coord1str.length() - 1));

        double x2 = Double.valueOf(coord2str.substring(1,comma2));
        double y2 = Double.valueOf(coord2str.substring(comma2 + 1, coord2str.length() - 1));

        if (x1 == x2) {
            System.out.println("These points are on a vertical line: x = " + x1);
            System.exit(0);
        }

        LinearEquation thisEq = new LinearEquation(x1, x2, y1, y2);

        System.out.println(thisEq.lineInfo());
//        System.out.println(thisEq.lineEquation());
//        System.out.println(thisEq.slopeString());
//        System.out.println(thisEq.yIntString());
//        System.out.println(thisEq.distanceString());

        System.out.print("Enter any value for x: ");
        double x = input.nextDouble();
        input.nextLine();

        System.out.println(thisEq.calculatePointString(x));

        input.close();
    }
}
