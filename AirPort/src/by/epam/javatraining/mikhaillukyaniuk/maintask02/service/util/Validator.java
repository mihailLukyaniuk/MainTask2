/**
 * Created by Mikhail Lukyaniuk 31.03.2019
 */
package by.epam.javatraining.mikhaillukyaniuk.maintask02.service.util;

import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities.AirVehicle;
import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities.Aircompany;
import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities.civil.passenger.PassengerPlane;
import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities.civil.transport.TransportPlane;
import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities.military.destroyer.DestroyerPlane;
import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities.military.stormtrooper.StormtrooperPlane;

public class Validator {

    private static boolean validate(AirVehicle plane) {
        return true;
    }

    public static boolean validateDestroyerPlane(DestroyerPlane destroyerPlane) {
        if (destroyerPlane == null)
            return false;
        if (destroyerPlane.getName() == null || destroyerPlane.getName().length() < 1)
            return false;
        if (destroyerPlane.getNumberOfPassengers() < 0)
            return false;
        if (destroyerPlane.getFuelConsumption() < 0)
            return false;
        if (destroyerPlane.getRangeOfFlight() < 0)
            return false;
        if (destroyerPlane.getPurpose() == null)
            return false;
        if (destroyerPlane.getNumberOfMissiles() < 0)
            return false;
        return validate(destroyerPlane);
    }

    public static boolean validateStormtrooperPlane(StormtrooperPlane stormtrooperPlane) {
        if (stormtrooperPlane == null)
            return false;
        if (stormtrooperPlane.getName() == null || stormtrooperPlane.getName().length() < 1)
            return false;
        if (stormtrooperPlane.getNumberOfPassengers() < 0)
            return false;
        if (stormtrooperPlane.getFuelConsumption() < 0)
            return false;
        if (stormtrooperPlane.getRangeOfFlight() < 0)
            return false;
        if (stormtrooperPlane.getPurpose() == null)
            return false;
        if (stormtrooperPlane.getNumberOfBombs() < 0)
            return false;
        return validate(stormtrooperPlane);
    }

    public static boolean validatePassengerPlane(PassengerPlane passengerPlane) {
        if (passengerPlane == null)
            return false;
        if (passengerPlane.getName() == null || passengerPlane.getName().length() < 1)
            return false;
        if (passengerPlane.getNumberOfPassengers() < 0)
            return false;
        if (passengerPlane.getFuelConsumption() < 0)
            return false;
        if (passengerPlane.getRangeOfFlight() < 0)
            return false;
        if (passengerPlane.getBusinessClass() < 0)
            return false;
        if (passengerPlane.getEconomyClass() < 0)
            return false;
        return validate(passengerPlane);
    }

    public static boolean validateTransportPlane(TransportPlane transportPlane) {
        if (transportPlane == null)
            return false;
        if (transportPlane.getName() == null || transportPlane.getName().length() < 1)
            return false;
        if (transportPlane.getNumberOfPassengers()< 0)
            return false;
        if (transportPlane.getFuelConsumption() < 0)
            return false;
        if (transportPlane.getRangeOfFlight() < 0)
            return false;
        if (transportPlane.isLoader() != true )
            return false;
        if (transportPlane.getLuggageCapacity() < 0)
            return false;
        return validate(transportPlane);
    }

    public static boolean validateAircompany(Aircompany aircompany) {
        if (aircompany == null || aircompany.getPlanes() == null)
            return false;
        return true;
    }
}