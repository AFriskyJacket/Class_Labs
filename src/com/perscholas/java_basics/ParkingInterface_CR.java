package com.perscholas.java_basics;
import java.util.*;
public class ParkingInterface_CR {
    public static void main(String[] args) {
        MallParking test = new MallParking(6);
        System.out.println(test);
        HospitalParking test2 = new HospitalParking(6);
        System.out.println(test2);
    }
}
/*Add three fields of type double  NIGHTLY = 30; MORNING = 20; TWENTY_FOUR = 45;

Create a method called processTicket() that returns a double.*/
interface ParkingSystem {
    // fields
    final double NIGHTLY = 30;
    final double MORNING = 20;
    final double TWENTY_FOUR = 45;
    //  method
    public double processTickets();
}

// HospitalParking that implements ParkingSystem
class HospitalParking implements ParkingSystem{
    double surcharge = .20;
    int time;
    double price;
    public HospitalParking(int time) {
        this.time = time;

        if (time < 6) {
            price = TWENTY_FOUR * (1 + surcharge);
        } else if (time < 17) {
            price = MORNING * (1 + surcharge);
        } else if (time <= 24) {
            price = NIGHTLY * (1 + surcharge);
        } else {
            System.out.println("Time out of bounds");
        }
    }

    @Override
    public double processTickets() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Price for hospital parking is $%.2f", price);
    }
}


// MallParking that implements ParkingSystem
class MallParking implements ParkingSystem{
    double surcharge = .10;
    int time;
    double price;
    public MallParking(int time){
        this.time = time;

        if (time < 6){
            price = TWENTY_FOUR*(1+surcharge);
        } else if (time<17) {
            price = MORNING*(1+surcharge);
        } else if (time<=24) {
            price = NIGHTLY * (1+surcharge);
        }  else {
            System.out.println("Time out of bounds");
        }
    }

    @Override
    public double processTickets() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Price for hospital parking is $%.2f", price);
    }
}