package Classes;

import java.util.Scanner;

/**
 * A class for controlling a robot
 */
public class RobotContrl {
    // Add variables, getters, setters and constructors if necessary
    private StateLonelyRobot stLonRobot = new StateLonelyRobot();

    // For use in another menu, it is better to make it private
    private void statusChanges() {
        Scanner sc = new Scanner(System.in);
        boolean tempChange = true;
        while (tempChange) {
            System.out.println("1 - current state, 2 - next state, 3 - prev state, 4 - exit state selection");
            System.out.print("Your choice: ");
            String choise = sc.next();
            switch (choise) {
                case "1":
                    stLonRobot.printStatus();
                    break;
                case "2":
                    stLonRobot.nextState();
                    break;
                case "3":
                    stLonRobot.previousState();
                    break;
                case "4":
                    tempChange = false;
                    break;
            }
        }
    }

    /**
     * Information about the robot
     */
    private void robotInfo() {
        System.out.println(SingletonRobot.getINSTANCE());
    }


    public void menu() {
        Scanner sc = new Scanner(System.in);
        boolean temp = true;
        while (temp) {
            System.out.println("1 - status change, 2 - robot info, 3 - exit");
            System.out.print("Your choice: ");
            String choise = sc.next();
            switch (choise) {
                case "1":
                    statusChanges();
                    break;
                case "2":
                    robotInfo();
                    break;
                case "3":
                    temp = false;
                    break;
            }
        }
    }
}
