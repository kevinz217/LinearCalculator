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
        return yCord1 - (xCord1 * yPerx);
    }

    public String equation() {
        String equation = "y = ";
        equation+= (yCord2 - yCord1) + "/" + (xCord2 - xCord1) + "x " + "+" + yIntercept();
        if (slope() == 0) {
            return "y = " + yIntercept();
        }
        return equation;
    }

    public double coordinateForX(double x) {
        return x * slope() + yIntercept();
    }

    public void lineInfo() {
        System.out.println("\n -------- Line Info --------");
        System.out.println("The two points are " + "(" + xCord1 + ", " + yCord1 + ") " + "and " + "(" + xCord2 + ", " + yCord2 + ") " );
        System.out.println("The equation of this line is: " + equation());
        System.out.println("The slope of this line is: " + slope());
        System.out.println("The y-intercept of this line is: " + yIntercept());
        System.out.println("The distance of this line is: " + distance());
    }
}
