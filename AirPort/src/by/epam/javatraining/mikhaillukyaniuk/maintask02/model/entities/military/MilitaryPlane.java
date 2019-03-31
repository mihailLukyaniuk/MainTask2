/**
 * Created by Mikhail Lukyaniuk 31.03.2019
 */
package by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities.military;

import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities.AirVehicle;
import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.enums.PurposeEnum;

abstract public class MilitaryPlane extends AirVehicle {
    private PurposeEnum purpose;

    public MilitaryPlane() {
    }

    public MilitaryPlane(String name, double carrying, double fuelConsumption, double flyDistance, PurposeEnum purpose) {
        super(name, carrying, fuelConsumption, flyDistance);
        this.purpose = purpose;
    }

    public PurposeEnum getPurpose() {
        return purpose;
    }

    public void setPurpose(PurposeEnum purpose) {
        this.purpose = purpose;
    }

    public int hashCode() {
        return 17 * (super.hashCode()) + 19 * (purpose.getValue().hashCode());
    }

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
        MilitaryPlane military = (MilitaryPlane) obj;
        if (!super.equals(military)) {
            return false;
        }
        if (this.purpose != military.purpose) {
            return false;
        }
        return true;
    }
}
