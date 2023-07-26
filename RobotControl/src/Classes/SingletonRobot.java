package Classes;

import Stuff.Point2D;

/**
 * A robot that exists in a single instance
 */
public class SingletonRobot {
    
    private SingletonRobot() {
    }

    private static SingletonRobot INSTANCE = new SingletonRobot();
    // Characteristics of the robot
    private int hp = 100;
    private double speed = 1.5;
    private Point2D currentPos;

    /**
     * Returns the current state of the robot
     * @return
     */
    public static SingletonRobot getINSTANCE() {
        return INSTANCE;
    }

    /**
     * Returns the initial characteristics of the robot
     */
    public void returnInitState() {
        this.hp = 100;
        this.speed = 1.5;
    }    

    // Adding robot action options, such as movement
    public void Move(String direction) {
        //
    }

    @Override
    public String toString() {
        return "SingletonRobot{" +
        "hp=" + hp +
        ", speed=" + speed +
        '}';
    }
}
