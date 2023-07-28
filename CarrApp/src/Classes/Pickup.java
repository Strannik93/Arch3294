package Classes;

import java.awt.Color;

import Classes.Types.TypeCar;
import Classes.Types.TypeFuel;
import Classes.Types.TypeGearBox;

public class Pickup extends Car implements iRefueling {

    private int loadCapasity;

    public Pickup(String make, String model, Color color, TypeCar bodyType, int numberWheels, TypeFuel fuel,
            TypeGearBox gearBox, Float engineCap, int loadCapasity) {
        super(make, model, color, bodyType, numberWheels, fuel, gearBox, engineCap);
        this.loadCapasity = loadCapasity;
    }

    @Override
    public int gearShift(int gear) {
        return 0;
    }

    public int getLoadCapasity() {
        return loadCapasity;
    }

    public void setLoadCapasity(int loadCapasity) {
        this.loadCapasity = loadCapasity;
    }

    @Override
    public void fuel() {
        
    }
    
}
