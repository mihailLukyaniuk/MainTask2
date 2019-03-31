/**
 * Created by Mikhail Lukyaniuk 31.03.2019
 */
package by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities.military.stormtrooper;

import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities.military.MilitaryPlane;
import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.enums.PurposeEnum;

public class StormtrooperPlane extends MilitaryPlane {
    private int numberOfBombs;

    public StormtrooperPlane() {
    }

    public StormtrooperPlane(String name, double carrying, double fuelConsumption, double flyDistance, PurposeEnum purpose, int numberOfBombs) {
        super(name, carrying, fuelConsumption, flyDistance, purpose);
        this.setNumberOfBombs(numberOfBombs);
    }

    public int getNumberOfBombs() {
        return numberOfBombs;
    }

    public void setNumberOfBombs(int numberOfBombs) {
        this.numberOfBombs = numberOfBombs;
    }

    @Override
    public int hashCode() {
        return 43 * super.hashCode() + 47 * numberOfBombs;
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
        StormtrooperPlane bomber = (StormtrooperPlane) obj;
        if (!super.equals(bomber)) {
            return false;
        }
        if (this.numberOfBombs != bomber.numberOfBombs) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(" StormtrooperPlane ");
        builder.append("{ model=");
        builder.append(super.getName());
        builder.append(" NumberOfPassengers=");
        builder.append(super.getNumberOfPassengers());
        builder.append(" RangeOfFlight=");
        builder.append(super.getRangeOfFlight());
        builder.append(" fuelConsumption=");
        builder.append(super.getFuelConsumption());
        builder.append(" purpose=");
        builder.append(super.getPurpose().getValue());
        builder.append(" numberOfBombs=");
        builder.append(getNumberOfBombs());
        builder.append("} ");
        return builder.toString();
    }
}
