package DesignPatterns.StrategyDesign;

import DesignPatterns.StrategyDesign.Strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveStrategyObject;


    //Called Constructor injection.
    Vehicle(DriveStrategy driveOb)
    {
        this.driveStrategyObject=driveOb;
    }

    public void drive()
    {
        driveStrategyObject.drive();
    }


}
