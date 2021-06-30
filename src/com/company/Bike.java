package com.company;

public class Bike implements CanDrive, CanStop,CanFix {

    @Override
    public void drive() {
        System.out.println("Bike can go");

    }

    @Override
    public void fix() {
        System.out.println("Bike can fix");

    }

    @Override
    public void stop() {
        System.out.println("Bike can stop");

    }
}
