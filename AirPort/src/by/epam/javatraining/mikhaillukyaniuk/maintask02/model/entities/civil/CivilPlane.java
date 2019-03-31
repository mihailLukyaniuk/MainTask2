/**
 * Created by Mikhail Lukyaniuk 31.03.2019
 */
package by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities.civil;

import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities.AirVehicle;

abstract public class CivilPlane extends AirVehicle {
    private double luggageCapacity;

    public CivilPlane() {
    }

    public CivilPlane(String name, double carrying, double fuelConsumption, double flyDistance, double luggageCapacity) {
        super(name, carrying, fuelConsumption, flyDistance);
        this.setLuggageCapacity(luggageCapacity);
    }

    public double getLuggageCapacity() {
        return luggageCapacity;
    }

    public void setLuggageCapacity(double luggageCapacity) {
        this.luggageCapacity = luggageCapacity;
    }

    @Override
    public int hashCode() {
        return 23 * (super.hashCode()) + 29 * (int) (luggageCapacity);
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
        CivilPlane civil = (CivilPlane) obj;
        if (!super.equals(civil)) {
            return false;
        }
        if (this.luggageCapacity != civil.luggageCapacity) {
            return false;
        }
        return true;
    }
}
