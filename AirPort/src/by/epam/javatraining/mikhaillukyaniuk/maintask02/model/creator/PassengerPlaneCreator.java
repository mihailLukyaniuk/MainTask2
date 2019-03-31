/**
 * Created by Mikhail Lukyaniuk 31.03.2019
 */
package by.epam.javatraining.mikhaillukyaniuk.maintask02.model.creator;

import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities.AirVehicle;
import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities.civil.passenger.PassengerPlane;
import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.enums.InfoEnum;
import by.epam.javatraining.mikhaillukyaniuk.maintask02.service.util.Messages;

import org.apache.log4j.Logger;

public class PassengerPlaneCreator implements Creator {

    private static Logger LOG = Logger.getLogger(PassengerPlaneCreator.class);

    public PassengerPlaneCreator(){LOG.info(Messages.getMessage(InfoEnum.PASSENGER_PLANE_CREATOR_CALLED));}

    private PassengerPlane passenger = new PassengerPlane();

    public AirVehicle getResult() {
        return passenger;
    }

    public void setArg(String name, String arg) {
        switch (name) {
            case "name":
                passenger.setName(arg);
                break;
            case "numberOfPassengers":
                passenger.setNumberOfPassengers(Double.parseDouble(arg));
                break;
            case "fuelConsumption":
                passenger.setFuelConsumption(Double.parseDouble(arg));
                break;
            case "rangeOfFlight":
                passenger.setRangeOfFlight(Double.parseDouble(arg));
                break;
            case "luggageCapacity":
                passenger.setLuggageCapacity(Double.parseDouble(arg));
                break;
            case "economyClass":
                passenger.setEconomyClass(Integer.parseInt(arg));
                break;
            case "businessClass":
                passenger.setBusinessClass(Integer.parseInt(arg));;
                break;
        }
    }
}
