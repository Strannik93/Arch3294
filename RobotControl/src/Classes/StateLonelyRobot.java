package Classes;

import Classes.States.*;

/**
 * A class for storing the current state of the robot and interacting with it
 */
public class StateLonelyRobot {
    private RobotState state = new OffState();

    // getter and setter
    
    public void setState(RobotState newState) {
        this.state = newState;
    }

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}
