package org.example;

public class Car extends Vehicle{
    private int numberOfDoors;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Car:\n" +
                "Manufacturer:'" + getManufacturer() + '\'' +
                ", Model='" + getModel() + '\'' +
                ", yearOfManufacture=" + getYearOfManufacture() +
                ", number of Doors: " + numberOfDoors +
                '}';
    }
}
