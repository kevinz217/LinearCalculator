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

        line = new LinearEquation(firstCord, secondCord);
    }

    private void calcStart() {
        boolean input = true;
        while (input) {
            createLine();
            if
            line.lineInfo();
            System.out.print("Enter a value for x: ");
            double x = scan.nextDouble();
            scan.nextLine();
            System.out.println("The point on the line is " + "(" + x + ", " + line.coordinateForX(x) +")");
            System.out.print("Would you like to enter another pair of coordinates? y/n ");
            String ans = scan.nextLine();
            if (ans.equals("n")) {
                input = false;
            }
        }
    }
}
