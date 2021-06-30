package com.company;

public class ToyotaCamry extends Car {

    @Override
    public void tuning() {

    }

    @Override
    public void drive() {
        System.out.println("Камри едет");
    }

    @Override
    public void stop() {
        System.out.println("Камри остановилась");
    }

    @Override
    public void fix() {
        System.out.println("Камри на ремонте");

    }
}
