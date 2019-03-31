/**
 * Created by Mikhail Lukyaniuk 31.03.2019
 */
package by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities.civil.passenger;

import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities.civil.CivilPlane;

public class PassengerPlane extends CivilPlane {
    private int economyClass;
    private int businessClass;

    public PassengerPlane() {
    }

    public PassengerPlane(String name, double carrying, double fuelConsumption, double flyDistance, double luggageCapacity, int economyClass, int businessClass) {
        super(name, carrying, fuelConsumption, flyDistance, luggageCapacity);
        this.setEconomyClass(economyClass);
        this.setBusinessClass(businessClass);
    }

    public int getEconomyClass() {
        return economyClass;
    }

    public void setEconomyClass(int economyClass) {
        this.economyClass = economyClass;
    }

    public int getBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(int businessClass) {
        this.businessClass = businessClass;
    }

    @Override
    public int hashCode() {
        return 31 * (super.hashCode()) + 34 * (economyClass) + 37 * (businessClass);
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
        PassengerPlane passenger = (PassengerPlane) obj;
        if (!super.equals(passenger)) {
            return false;
        }
        if (this.economyClass != passenger.economyClass) {
            return false;
        }
        if (this.businessClass != passenger.businessClass) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(" PassengerPlane ");
        builder.append("{ model=");
        builder.append(super.getName());
        builder.append(" numberOfPassengers=");
        builder.append(super.getNumberOfPassengers());
        builder.append(" rangeOfFlight=");
        builder.append(super.getRangeOfFlight());
        builder.append(" fuelConsumption=");
        builder.append(super.getFuelConsumption());
        builder.append(" businessClass=");
        builder.append(getBusinessClass());
        builder.append(" economyClass=");
        builder.append(getEconomyClass());
        builder.append("} ");
        return builder.toString();
    }
}
