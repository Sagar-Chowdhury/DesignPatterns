package DesignPatterns.StrategyDesign;


import DesignPatterns.StrategyDesign.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {


    OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }

}
