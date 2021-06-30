package com.company;

public class Main {

    public static void main(String[] args) {

        final int N = 4;
        Car cars[] = new Car[N];

        cars[0] = new ToyotaCarolla();
        cars[1] = new ToyotaCamry();
        cars[2] = new ToyotaCarolla();
        cars[3] = new ToyotaCamry();

        for (int i = 0; i < N; ++i){
            cars[i].go();
            cars[i].stop();
            cars[i].fix();
        }




    }
}
