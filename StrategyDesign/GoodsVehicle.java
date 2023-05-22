package DesignPatterns.StrategyDesign;

import DesignPatterns.StrategyDesign.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {

    GoodsVehicle(){ super(new NormalDriveStrategy()); }

}
