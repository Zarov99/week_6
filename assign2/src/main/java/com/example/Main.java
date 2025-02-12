package com.example;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        System.out.println(Vehicle.make());
        System.out.println(v.model());
        System.out.println(v.speed());
        v.go();
        v.stop();
    }

    public static class Vehicle {
        
        public static String make() {
            return "make";
        }

        public String model() {
            return "model";
        }

        public int speed() {
            return 0;
        }
        //this is a test
        public void go() {
            System.out.println("Going");
        }
        public void stop() {
            System.out.println("Stopping");
        }
    }
}