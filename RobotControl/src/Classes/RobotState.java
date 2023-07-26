package Classes;

/**
 * Interface for creating robot states
 */
public interface RobotState {
    void next(StateLonelyRobot stLonRobot);
    void prev(StateLonelyRobot stLonRobot);
    void printStatus();
}
