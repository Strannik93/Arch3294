package Classes;

import java.awt.*;

import Classes.Types.TypeCar;
import Classes.Types.TypeFuel;
import Classes.Types.TypeGearBox;

public abstract class Car {
    private String make;
    private String model;
    private Color color;
    private TypeCar bodyType;
    private int numberWheels;
    private TypeFuel fuel;
    private TypeGearBox gearBox;
    private Float engineCap;

    public Car(String make, String model, Color color, TypeCar bodyType, int numberWheels, TypeFuel fuel,
            TypeGearBox gearBox, Float engineCap) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.numberWheels = numberWheels;
        this.fuel = fuel;
        this.gearBox = gearBox;
        this.engineCap = engineCap;
    }

    public void movement() { }

    public void maintenance() { }

    public abstract int gearShift(int gear);

    public boolean turnLigths() {
        return true;
    }

    public boolean trnWprs() {
        return true;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    public TypeCar getBodyType() {
        return bodyType;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public TypeFuel getFuel() {
        return fuel;
    }

    public TypeGearBox getGearBox() {
        return gearBox;
    }

    public Float getEngineCap() {
        return engineCap;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setBodyType(TypeCar bodyType) {
        this.bodyType = bodyType;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public void setFuel(TypeFuel fuel) {
        this.fuel = fuel;
    }

    public void setGearBox(TypeGearBox gearBox) {
        this.gearBox = gearBox;
    }

    public void setEngineCap(Float engineCap) {
        this.engineCap = engineCap;
    }
}
