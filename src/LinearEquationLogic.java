import java.util.Scanner;
public class LinearEquationLogic {
    private LinearEquation line;
    private Scanner scan;

    public LinearEquationLogic() {
        line = null;
        scan = new Scanner(System.in);
    }

    public void start() {
        calcStart();
    }

    private void createLine() {
        System.out.print("Enter first coordinate: ");
        String firstCord = scan.nextLine();
        System.out.print("Enter second coordinate: ");
        String secondCord = scan.nextLine();
        int halfway = firstCord.indexOf(",");
        int halfway2 = secondCord.indexOf(",");
        int x1 = Integer.parseInt(firstCord.substring(1,halfway));
        int y1 = Integer.parseInt(firstCord.substring(halfway + 2, (firstCord.length() - 1)));
        int x2 = Integer.parseInt(secondCord.substring(1,halfway2));
        int y2 = Integer.parseInt(secondCord.substring(halfway2 + 2, (secondCord.length() - 1)));
        line = new LinearEquation(x1, y1, x2, y2);
    }

    private void calcStart() {
        boolean input = true;
        while (input) {
            createLine();
            line.lineInfo();
            if (line.getX1() != line.getX2()) {
                System.out.print("Enter a value for x: ");
                double x = scan.nextDouble();
                scan.nextLine();
                System.out.println("The point on the line is " + "(" + x + ", " + line.coordinateForX(x) + ")");
            }
            System.out.print("Would you like to enter another pair of coordinates? y/n ");
            String ans = scan.nextLine();
            if (ans.equals("n")) {
                input = false;
            }
        }
        System.out.print("Thanks for using the linear calculator!" + "\n");
    }
}
