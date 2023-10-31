public class LinearEquation {
    private int xCord1;
    private int yCord1;
    private int xCord2;
    private int yCord2;

    //constructor to create x and y coordinates
    public LinearEquation(int x1, int y1, int x2, int y2) {
        xCord1 = x1;
        yCord1 = y1;
        xCord2 = x2;
        yCord2 = y2;
    }

    public int getX1() {
        return xCord1;
    }

    public int getX2() {
        return xCord2;
    }

    public double roundToHundredth(double num) {
        return (double) (Math.round(num * 100)) /100;
    }

    public double distance() {
        double expression1 = Math.pow(xCord2 - xCord1, 2);
        double expression2 = Math.pow(yCord2 - yCord1, 2);
        double distance = Math.sqrt(expression1 + expression2);
        distance = roundToHundredth(distance);
        return distance;
    }

    public double slope() {
        double expression1 = yCord2 - yCord1;
        double expression2 = xCord2 - xCord1;
        double slope = expression1 / expression2;
        slope = roundToHundredth(slope);
        return slope;
    }

    public double yIntercept() {
        double divNum = xCord2 - xCord1;
        double yPerx = (yCord2 - yCord1) / divNum;
        return roundToHundredth(yCord1 - (xCord1 * yPerx));
    }

    public String equation() {
        String equation = "y = ";
        int numerator = yCord2 - yCord1;
        int denominator = xCord2 - xCord1;
        if ((numerator < 0 ) && (denominator < 0)) {
            numerator*= -1;
            denominator*= -1;
        }
        if (numerator % denominator == 0) {
            int coefficient = (int) (numerator / denominator);
            equation+= coefficient + "x " + "+ " + yIntercept();
        } else {
            equation+= (numerator) + "/" + (denominator) + "x " + "+ " + yIntercept();
        }
        if (slope() == 0) {
            if (yIntercept() % 1 == 0) {
                return "y = " + (int) yIntercept();
            }
            return "y = " + yIntercept();
        }
        if (yIntercept() == 0) {
            return "y = "  + (yCord2 - yCord1) + "/" + (xCord2 - xCord1) + "x ";
        }
        return equation;
    }

    public double coordinateForX(double x) {
        return roundToHundredth(x * slope() + yIntercept());
    }

    public String lineInfo() {
        if (xCord1 == xCord2) {
            return ("\n" + "These points are on a vertical line: x = " + xCord1 + "\n");
        } else {
            String info = "";
            info += ("\n -------- Line Info --------");
            info +=("\n" + "The two points are " + "(" + xCord1 + ", " + yCord1 + ") " + "and " + "(" + xCord2 + ", " + yCord2 + ") ");
            info +=("\n" + "The equation of this line is: " + equation());
            info +=("\n" + "The slope of this line is: " + slope());
            info +=("\n" + "The y-intercept of this line is: " + yIntercept());
            info +=("\n" + "The distance of this line is: " + distance() + "\n");
            return info;
        }
    }
}
