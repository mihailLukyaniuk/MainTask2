/**
 * Created by Mikhail Lukyaniuk 31.03.2019
 */
package by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities.military.destroyer;

import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities.military.MilitaryPlane;
import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.enums.PurposeEnum;

public class DestroyerPlane extends MilitaryPlane {
    private int numberOfMissiles;

    public  DestroyerPlane() {
    }

    public  DestroyerPlane(String name, double carrying, double fuelConsumption, double flyDistance, PurposeEnum purpose, int numberOfMissiles) {
        super(name, carrying, fuelConsumption, flyDistance, purpose);
        this.setNumberOfMissiles(numberOfMissiles);
    }

    public int getNumberOfMissiles() {
        return numberOfMissiles;
    }

    public void setNumberOfMissiles(int numberOfMissiles) {
        this.numberOfMissiles = numberOfMissiles;
    }

    @Override
    public int hashCode() {
        return 49 * super.hashCode() + 51 * numberOfMissiles;
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
        DestroyerPlane fighter = (DestroyerPlane) obj;
        if (!super.equals(fighter)) {
            return false;
        }
        if (this.numberOfMissiles != fighter.numberOfMissiles) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(" DestroyerPlane ");
        builder.append("{ model=");
        builder.append(super.getName());
        builder.append(" NumberOfPassengers=");
        builder.append(super.getNumberOfPassengers());
        builder.append(" rangeOfFlight=");
        builder.append(super.getRangeOfFlight());
        builder.append(" fuelConsumption=");
        builder.append(super.getFuelConsumption());
        builder.append(" purpose=");
        builder.append(super.getPurpose().getValue());
        builder.append(" numberOfMissiles=");
        builder.append(getNumberOfMissiles());
        builder.append("} ");
        return builder.toString();
    }
}
