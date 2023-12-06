package org.example;

public class Motorcycle extends Vehicle{
    private String typeOfMotorcycle;
    private int maxSpeed;
    private String hersteller;

    public String getTypeOfMotorcycle() {
        return typeOfMotorcycle;
    }

    public void setTypeOfMotorcycle(String typeOfMotorcycle) {
        this.typeOfMotorcycle = typeOfMotorcycle;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    @Override
    public String toString() {
        return "Motorcycle:\n" +
                "Manufacturer='" + getManufacturer() + '\'' +
                ", Model='" + getModel() + '\'' +
                ", yearOfManufacture=" + getYearOfManufacture() +
                ", type of Motorcycle=" + getTypeOfMotorcycle() +
                ", maxSpeed=" + getMaxSpeed() +
                ", hersteller=" + getHersteller()+
                '}';
    }
}
