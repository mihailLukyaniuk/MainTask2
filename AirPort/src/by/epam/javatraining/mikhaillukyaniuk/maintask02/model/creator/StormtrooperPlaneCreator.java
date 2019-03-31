/**
 * Created by Mikhail Lukyaniuk 31.03.2019
 */
package by.epam.javatraining.mikhaillukyaniuk.maintask02.model.creator;

import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities.AirVehicle;
import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities.military.stormtrooper.StormtrooperPlane;
import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.enums.InfoEnum;
import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.enums.PurposeEnum;
import by.epam.javatraining.mikhaillukyaniuk.maintask02.service.util.Messages;

import org.apache.log4j.Logger;

public class StormtrooperPlaneCreator implements Creator {

    private static Logger LOG = Logger.getLogger(StormtrooperPlaneCreator.class);

    public StormtrooperPlaneCreator(){LOG.info(Messages.getMessage(InfoEnum.STORMTROOPER_PLANE_CREATOR_CALLED));}

    private StormtrooperPlane stormtrooper = new StormtrooperPlane();

    public AirVehicle getResult() {
        return stormtrooper;
    }

    public void setArg(String name, String arg) {
        switch (name) {
            case "name":
            	stormtrooper.setName(arg);
                break;
            case "numberOfPassengers ":
            	stormtrooper.setNumberOfPassengers(Double.parseDouble(arg));
                break;
            case "fuelConsumption":
            	stormtrooper.setFuelConsumption(Double.parseDouble(arg));
                break;
            case "rangeOfFlight":
            	stormtrooper.setRangeOfFlight(Double.parseDouble(arg));
                break;
            case "luggageCapacity":
            	stormtrooper.setNumberOfBombs(Integer.parseInt(arg));
                break;
            case "purpose":
            	stormtrooper.setPurpose(PurposeEnum.STORMTROOPER);
                break;
            case "numberOfBombs":
            	stormtrooper.setNumberOfBombs(Integer.parseInt(arg));
                break;
        }
    }
}
