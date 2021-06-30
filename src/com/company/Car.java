package com.company;

import javax.management.monitor.StringMonitor;

abstract class Car {
    String model;


    public abstract void go();
    public abstract void stop();
    public abstract void fix();

    public void setModel(String model){
        this.model =model;
    }

}
