package com.interview2026.hard;

public class SealedClass {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.startVehicle();
        v2.startVehicle();
    }
}
