package Classes.States;

import Classes.RobotState;
import Classes.StateLonelyRobot;

/**
 * The calm state of the robot
 */
public class CalmState implements RobotState{

    @Override
    public void next(StateLonelyRobot stLonRobot) {
        stLonRobot.setState(new CombatState());
    }

    @Override
    public void prev(StateLonelyRobot stLonRobot) {
        stLonRobot.setState(new OffState());
    }

    @Override
    public void printStatus() {
        System.out.println("off state - calm state - combat state\nCurrent state - calm state");
    }
    
}
