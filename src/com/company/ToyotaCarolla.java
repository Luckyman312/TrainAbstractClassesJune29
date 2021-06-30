package com.company;

public class ToyotaCarolla  extends Car{

    @Override
    public void tuning() {

    }

    @Override
    public void drive() {
        System.out.println("Королла едет");
    }

    @Override
    public void stop() {
        System.out.println("Королла остановилась");
    }

    @Override
    public void fix() {
        System.out.println("Королла на ремонте");

    }
}
