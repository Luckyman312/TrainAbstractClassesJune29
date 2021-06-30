package com.company;

import javax.management.monitor.StringMonitor;

abstract class Car implements CanDrive, CanFix, CanStop  {
    @Override
    public void drive() {
        System.out.println(" CarC can drive");

    }

    @Override
    public void fix() {
        System.out.println("Car can fix");

    }

    @Override
    public void stop() {
        System.out.println("Car can stop");

    }

    String model;

    public void setModel(String model){
        this.model =model;
    }
    public abstract void tuning();

}
