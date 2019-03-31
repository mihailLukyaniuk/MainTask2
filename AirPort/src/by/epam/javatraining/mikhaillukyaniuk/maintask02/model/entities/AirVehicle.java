/**
 * Created by Mikhail Lukyaniuk 31.03.2019
 */
package by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities;

abstract public class AirVehicle {
    private String name;
    private double rangeOfFlight;
    private double numberOfPassengers;
    private double fuelConsumption;
    
    public AirVehicle() {
    }

    public AirVehicle(String name, double numberOfPassengers, double fuelConsumption, double rangeOfFlight) {
        this.setName(name);
        this.setNumberOfPassengers(numberOfPassengers);
        this.setRangeOfFlight(rangeOfFlight);
        this.setFuelConsumption(fuelConsumption);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumberOfPassengers(double carrying) {
        this.numberOfPassengers = carrying;
    }

    public double getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setRangeOfFlight(double flyDistance) {
        this.rangeOfFlight = flyDistance;
    }

    public double getRangeOfFlight() {
        return rangeOfFlight;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public int hashCode() {
        return (int) (3 * numberOfPassengers) + (int) (5 * rangeOfFlight) + (int) (7 * fuelConsumption) + 13 * (name.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        AirVehicle plane = (AirVehicle) obj;
        if (this.numberOfPassengers != plane.numberOfPassengers) {
            return false;
        }
        if (this.fuelConsumption != plane.fuelConsumption) {
            return false;
        }
        if (!this.name.equals(plane.name)) {
            return false;
        }
        if (this.rangeOfFlight != plane.rangeOfFlight) {
            return false;
        }
        return true;
    }

}
