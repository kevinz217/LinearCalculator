public class LinearEquation {
    private int xCord1;
    private int yCord1;
    private int xCord2;
    private int yCord2;

    //constructor to create x and y coordinates
    public LinearEquation(String firstCord, String secondCord) {
        int halfway = firstCord.indexOf(",");
        int halfway2 = secondCord.indexOf(",");
        xCord1 = Integer.parseInt(firstCord.substring(1,halfway));
        yCord1 = Integer.parseInt(firstCord.substring(halfway + 2, (firstCord.length() - 1)));
        xCord2 = Integer.parseInt(secondCord.substring(1,halfway2));
        yCord2 = Integer.parseInt(secondCord.substring(halfway2 + 2, (secondCord.length() - 1)));
    }

    public double distance() {
        double expression1 = Math.pow(xCord2 - xCord1, 2);
        double expression2 = Math.pow(yCord2 - yCord1, 2);
        double distance = Math.sqrt(expression1 + expression2);
        distance = (double) (Math.round(distance * 100)) / 100;
        return distance;
    }

    public double slope() {
        double expression1 = yCord2 - yCord1;
        double expression2 = xCord2 - xCord1;
        double slope = expression1 / expression2;
        slope = (double) (Math.round(slope * 100)) / 100;
        return slope;
    }

    public String equation() {
        double yInt = 34;
        String equation = slope() + "x";
        return equation;
    }
}
