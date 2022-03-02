package com.ug4.soal1;

import java.sql.Driver;
import java.util.ArrayList;

public class Bus {
    private String name;
    private Driver driver;
    private int{read_only} capacity;
    private final ArrayList<Passenger> passenger;
    int usedCapacity;
    final double fares;
    double profit;
    String[] {read_only} ROUTE;

    String getName(){
        return name;
    }

    void setName(String){

    }

    Driver getDriver(){
        return driver;
    }

    void setDriver(Driver){

    }

    int Capacity(){
        return  Capacity;
    }

    ArrayList<Passenger> getPassenger(){

    }

    int getUsedCapacity(){
        return usedCapacity;
    }

    void setUsedCapacity(int){

    }

    double getFares(){
        return fares;
    }

    double getProfit(){
        return profit;
    }

    String[] getROUTE(){
        return ROUTE;
    }

    Void setProfit(double){

    }

    boolean checkPassengerBalance(Passenger){

    }

    void topUpBalance(double, Passenger ){

    }

    Void takePassanger(Passenger){

    }

    void dropPassanger(Passenger){

    }
    void proceedOrder(String, Passenger){

    }

    String cancelOrder(Passenger){

    }
}
