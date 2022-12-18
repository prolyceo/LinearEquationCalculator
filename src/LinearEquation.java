// TODO
// public double roundedToHundredth(double toRound)
// simplify fraction having 2 negatives [ -1/-1 becomes 1, etc], to do with strings
import java.text.DecimalFormat;
import java.math.BigDecimal;

public class LinearEquation {
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    public LinearEquation(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double roundedToHundredth(double toRound) {
        BigDecimal bd = new BigDecimal(toRound);
        BigDecimal roundedOffBd = bd.setScale(2, java.math.RoundingMode.HALF_EVEN);
        return roundedOffBd.doubleValue();
    }

    public String twoPoints() {
        return "The two points are: (" + removeEnd.format(x1) + "," + removeEnd.format(y1) + ") and (" + removeEnd.format(x2) + "," + removeEnd.format(y2) + ")";
    }

    private double yIntDouble() {
        double b;
        b = y1 - (((y2 - y1) / (x2 - x1)) * x1);
        return roundedToHundredth(b);
    }

    private double yIntercept() {
        double returnY = Double.parseDouble(removeEnd.format(yIntDouble())); 
        return returnY;
    }

    DecimalFormat removeEnd = new DecimalFormat("#.##");

    private String slopeString() {
        // return roundedToHundredth((y2 - y1) / (x2 - x1));
        if ((y2 - y1)/(x2 - x1) == 1) {
            return "";
        } else if ((y2 - y1)/(x2 - x1) == -1) {
            return "-";
        }
        if ((y2 - y1) < 0 && (x2 - x1) < 0 || (x2 - x1) < 0 && (y2 - y1) > 0) {
            return removeEnd.format(roundedToHundredth((y2 - y1)*-1)) + "/" + removeEnd.format(roundedToHundredth((x2 - x1)*-1));
        } else {
            return removeEnd.format(roundedToHundredth(y2 - y1)) + "/" + removeEnd.format(roundedToHundredth(x2 - x1));
        }
    }

    private double slope() {
        double tempD = roundedToHundredth((y2 - y1) / (x2 - x1));
        String toReturnD = removeEnd.format(tempD);
        double returnD = Double.parseDouble(toReturnD);
        return ReturnD;
    }

    public String equation() {
        if (slopeDouble() != 0) {
            if (yIntDouble() > 0) {
                return "The equation of the line between the two points is: y = " + slopeString() + "x" + " + " + yInt();
            } else if (yIntDouble() < 0) {
                return "The equation of the line between the two points is: y = " + slopeString() + "x " + yInt();
            } else {
                return "The equation of the line between the two points is: y = " + slopeString() + "x";
            }
        } else {
            if (yIntDouble() != 0) {
                return "The equation of the line between the two points is: y = " + yInt();
            } else {
                return "The equation of the line between the two points is: y = 0";
            }
        }
    }

//     public String slopeString() {
//         return "The slope of the line is " + removeEnd.format(slopeDouble());
//     }

    public String yInterceptString() {
        return "The y-intercept is " + yIntercept();
    }

    private double calculateDistance() {
        return roundedToHundredth(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }

    public String distance() {
        return "The distance between the 2 points is " + removeEnd.format(calculateDistance());
    }

    private double calculatePoint(double x) {
        double y;
        y = (slopeDouble() * x) + yIntDouble();
        return y;
    }

    public String calculatePointString(double x) {
        return "The point on the line is (" + removeEnd.format(x) + "," + removeEnd.format(calculatePoint(x)) + ")";
    }
    
    public String lineInfo() {
        String toReturn = "";
        toReturn += "   Line info:   " + "\n";
        toReturn += "The two points are: (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ")" + "\n";
        toReturn += equation() + "\n";
        toReturn += slopeString() + "\n";
        toReturn += yIntString() + "\n";
        toReturn += distanceString() + "\n";
        return toReturn;
    }
}
