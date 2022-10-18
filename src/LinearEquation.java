public class LinearEquation {
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    public LinearEquation(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public String twoPoints() {
        return "The two points are: (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ")";
    }

    private double yInt() {
        double b;
        b = y1 - (((y2 - y1) / (x2 - x1)) * x1);
        return b;
    }

    private double slope() {
        return (y2 - y1) / (x2 - x1);
    }

    public String lineEquation() {
        return "The equation of the line between the two points is: y = " + slope() + "x" + " + " + yInt();
    }

    public String slopeString() {
        return "The slope of the line is " + slope();
    }

    public String yIntString() {
        return "The y-intercept is " + yInt();
    }

    private double calculateDistance() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public String distanceString() {
        return "The distance between the 2 points is " + calculateDistance();
    }

    private double calculatePoint(double x) {
        double y;
        y = (slope() * x) + yInt();
        return y;
    }

    public String calculatePointString(double x) {
        return "The point on the line is (" + x + "," + calculatePoint(x) + ")";
    }
}