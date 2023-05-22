package DesignPatterns.StrategyDesign;

import DesignPatterns.StrategyDesign.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

    SportsVehicle()
    {
        super(new SportsDriveStrategy());
    }

}
