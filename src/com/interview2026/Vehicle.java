package com.interview2026;

sealed class Vehicle permits Car, Bike{
    public void startVehicle(){
        System.out.println("Starting vehicle");
    }

}
