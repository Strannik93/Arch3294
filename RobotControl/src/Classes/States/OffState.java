package Classes.States;

import Classes.RobotState;
import Classes.StateLonelyRobot;

/**
 * Off state of the robot
 */
public class OffState implements RobotState {

    @Override
    public void next(StateLonelyRobot stLonRobot) {
        stLonRobot.setState(new CalmState());
    }

    @Override
    public void prev(StateLonelyRobot stLonRobot) {
        System.out.println("The robot is in its initial state.");
    }

    @Override
    public void printStatus() {
        System.out.println("off state - calm state - combat state\nCurrent state - off state");
    }
    
}
