import java.util.Scanner;
public class LinearEquationLogic {
    private LinearEquation line;
    private Scanner scan;

    public LinearEquationLogic() {
        line = null;
        scan = new Scanner(System.in);
    }

    public void start() {
        createLine();
        calcStart();
    }

    private void createLine() {
        System.out.print("Enter first coordinate: ");
        String firstCord = scan.nextLine();
        System.out.print("Enter second coordinate: ");
        String secondCord = scan.nextLine();

        line = new LinearEquation(firstCord, secondCord);
    }

    // currently only used for testing methods
    private void calcStart() {
        System.out.println("The distance of the line is: " + line.distance());
        System.out.println("The slope of the line is: " + line.slope());
    }
}
