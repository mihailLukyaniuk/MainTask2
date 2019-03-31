/**
 * Created by Mikhail Lukyaniuk on 31.03.2109.
 */
package by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities;

import java.util.ArrayList;


public class Aircompany {
    private ArrayList<AirVehicle> planes;

    public Aircompany() {
        planes = new ArrayList<AirVehicle>();
    }

    public void add(AirVehicle plane) {
        planes.add(plane);
    }

    public ArrayList<AirVehicle> getPlanes() {
        return planes;
    }

    public void setPlanes(ArrayList<AirVehicle> planes) {
        this.planes = planes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        int i = 1;
        for (AirVehicle plane : planes) {
            hash = (i++) * plane.hashCode();
        }
        return hash;
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
        Aircompany aircompany = (Aircompany) obj;
        if (this.planes != aircompany.planes) {
            if (this.planes == null) {
                return false;
            }
        }
        if (!this.planes.equals(aircompany.planes)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Aircompany{");
        builder.append("plane=\n");
        for (AirVehicle plane : planes) {
            builder.append("\t");
            builder.append(plane);
            builder.append("\n");
        }
        builder.append("}");
        return builder.toString();
    }
}
