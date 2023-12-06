package org.example;

public class Vehicle {
    private String Manufacturer;
    private String Model;
    private int yearOfManufacture;

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public String toString() {
        return "Vehicle:\n" +
                "Manufacturer='" + Manufacturer + '\'' +
                ", Model='" + Model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }
}
