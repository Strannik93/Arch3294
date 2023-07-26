package Classes.States;

import Classes.RobotState;
import Classes.StateLonelyRobot;

/**
 * The combat state of the robot
 */
public class CombatState implements RobotState {

    @Override
    public void next(StateLonelyRobot stLonRobot) {
        System.out.println("The robot is in its latest state.");
    }

    @Override
    public void prev(StateLonelyRobot stLonRobot) {
        
        stLonRobot.setState(new CalmState());
    }

    @Override
    public void printStatus() {
        System.out.println("off state - calm state - combat state\nCurrent state - combat state");
    }
    
}
