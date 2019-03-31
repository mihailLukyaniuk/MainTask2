/**
 * Created by Mikhail Lukyaniuk 31.03.2019
 */
package by.epam.javatraining.mikhaillukyaniuk.maintask02.model.creator;

import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities.AirVehicle;
import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities.military.destroyer.DestroyerPlane;
import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.enums.InfoEnum;
import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.enums.PurposeEnum;
import by.epam.javatraining.mikhaillukyaniuk.maintask02.service.util.Messages;

import org.apache.log4j.Logger;

public class DestroyerPlaneCreator implements Creator {

    private static Logger LOG = Logger.getLogger(DestroyerPlaneCreator.class);

    public DestroyerPlaneCreator(){LOG.info(Messages.getMessage(InfoEnum.DESTROYER_PLANE_CREATOR_CALLED));}
    private DestroyerPlane destroyer = new DestroyerPlane();

    public AirVehicle getResult() {
        return destroyer;
    }

    public void setArg(String name, String arg) {
        switch (name) {
            case "name":
            	destroyer.setName(arg);
                break;
            case "numberOfPassengers":
            	destroyer.setNumberOfPassengers(Double.parseDouble(arg));
                break;
            case "fuelConsumption":
            	destroyer.setFuelConsumption(Double.parseDouble(arg));
                break;
            case "rangeOfFlight":
            	destroyer.setRangeOfFlight(Double.parseDouble(arg));
                break;
            case "luggageCapacity":
            	destroyer.setNumberOfMissiles(Integer.parseInt(arg));
                break;
            case "purpose":
            	destroyer.setPurpose(PurposeEnum.DESTROYER);
                break;
            case "numberOfMissiles":
            	destroyer.setNumberOfMissiles(Integer.parseInt(arg));
                break;
        }
    }
}
