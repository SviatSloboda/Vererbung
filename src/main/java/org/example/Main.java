package org.example;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setManufacturer("BMW");
        car1.setModel("x7");
        car1.setYearOfManufacture(2009);
        car1.setNumberOfDoors(4);

        Motorcycle motorcycle1 = new Motorcycle();
        motorcycle1.setManufacturer("Kawasaki");
        motorcycle1.setModel("hr1");
        motorcycle1.setYearOfManufacture(2022);
        motorcycle1.setTypeOfMotorcycle("super Sport");
        motorcycle1.setMaxSpeed(299);
        motorcycle1.setHersteller("Japan");

        Vehicle vehicle1 = new Vehicle();
        vehicle1.setManufacturer("BMW");
        vehicle1.setModel("x3");
        vehicle1.setYearOfManufacture(2021);

        System.out.println(vehicle1);
        System.out.println(car1);
        System.out.println(motorcycle1);
    }
}