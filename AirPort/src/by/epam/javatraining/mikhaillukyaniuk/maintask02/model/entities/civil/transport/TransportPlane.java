/**
 * Created by Mikhail Lukyaniuk 31.03.2019
 */
package by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities.civil.transport;

import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities.civil.CivilPlane;

public class TransportPlane extends CivilPlane {
    private boolean loader;

    public TransportPlane() {
    }

    public TransportPlane(String name, double carrying, double fuelConsumption, double flyDistance, double luggageCapacity, boolean loader) {
        super(name, carrying, fuelConsumption, flyDistance, luggageCapacity);
        this.setLoader(loader);
    }

    public boolean isLoader() {
        return loader;
    }

    public void setLoader(boolean loader) {
        this.loader = loader;
    }

    @Override
    public int hashCode() {
        return 37 * (super.hashCode()) + 41 * (loader ? 1 : 0);
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
        TransportPlane transport = (TransportPlane) obj;
        if (!super.equals(transport)) {
            return false;
        }
        if (this.loader != transport.loader) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(" TransportPlane ");
        builder.append("{ model=");
        builder.append(super.getName());
        builder.append(" NumberOfPassengers=");
        builder.append(super.getNumberOfPassengers());
        builder.append(" RangeOfFlight=");
        builder.append(super.getRangeOfFlight());
        builder.append(" fuelConsumption=");
        builder.append(super.getFuelConsumption());
        builder.append(" loader=");
        builder.append(isLoader());
        builder.append("} ");
        return builder.toString();
    }
}

