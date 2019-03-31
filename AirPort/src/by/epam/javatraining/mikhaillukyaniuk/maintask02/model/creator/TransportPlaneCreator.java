/**
 * Created by Mikhail Lukyaniuk 31.03.2019
 */
package by.epam.javatraining.mikhaillukyaniuk.maintask02.model.creator;

import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities.AirVehicle;
import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities.civil.transport.TransportPlane;
import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.enums.InfoEnum;
import by.epam.javatraining.mikhaillukyaniuk.maintask02.service.util.Messages;

import org.apache.log4j.Logger;

public class TransportPlaneCreator implements Creator {

    private static Logger LOG = Logger.getLogger(TransportPlaneCreator.class);

    public TransportPlaneCreator(){LOG.info(Messages.getMessage(InfoEnum.TRANSPORT_PLANE_CREATOR_CALLED));}

    private TransportPlane transport = new TransportPlane();

    public AirVehicle getResult() {
        return transport;
    }

    public void setArg(String name, String arg) {
        switch (name) {
            case "name":
                transport.setName(arg);
                break;
            case "numberOfPassengers":
                transport.setNumberOfPassengers(Double.parseDouble(arg));
                break;
            case "fuelConsumption":
                transport.setFuelConsumption(Double.parseDouble(arg));
                break;
            case "rangeOfFlight":
                transport.setRangeOfFlight(Double.parseDouble(arg));
                break;
            case "luggageCapacity":
                transport.setLuggageCapacity(Double.parseDouble(arg));
                break;
            case "loader":
                transport.setLoader(Boolean.parseBoolean(arg));
                break;
        }
    }
}