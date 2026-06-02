package com.interview2026.easy;

sealed class Vehicle permits Car, Bike{
    public void startVehicle(){
        System.out.println("Starting vehicle");
    }

}
