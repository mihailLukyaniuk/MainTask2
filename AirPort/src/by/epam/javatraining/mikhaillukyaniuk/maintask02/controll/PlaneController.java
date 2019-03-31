/**
 * Created by Mikhail Lukyaniuk 31.03.2019
 */
package by.epam.javatraining.mikhaillukyaniuk.maintask02.controll;

import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities.AirVehicle;
import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities.Aircompany;
import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.enums.InfoEnum;
import by.epam.javatraining.mikhaillukyaniuk.maintask02.service.util.*;

import java.util.ArrayList;
import java.util.Comparator;

import org.apache.log4j.*;
/**
 * Created by Mikhail Lukyaniuk 31.03.2019
 */
import org.apache.log4j.xml.DOMConfigurator;

public class PlaneController {

    private static Logger LOG = Logger.getLogger(PlaneController.class);

    private Aircompany aircompany;

    public Aircompany createAircompany() {
        try {
            {
                new DOMConfigurator().doConfigure("log4j.xml", LogManager.getLoggerRepository());
            }
            XMLPlanesReader xmlPlanesReader = new XMLPlanesReader();
            aircompany = xmlPlanesReader.read();
            LOG.info(Messages.getMessage(InfoEnum.CREATE_AIRCOMPANY));
        } catch (Exception e) {
            ExceptionHandler.handle(e);
        }
        return aircompany;
    }

    public void getCarrying() {
        try {
            LOG.debug(Messages.getMessage(InfoEnum.GET_ALL_CARRYING));
            if (!Validator.validateAircompany(aircompany))
                throw new IllegalArgumentException();
            int result = 0;
            ArrayList<AirVehicle> planes = aircompany.getPlanes();

            for (AirVehicle plane : planes) {
                result += plane.getNumberOfPassengers();
            }
            System.out.println("All carrying = " + result);
            LOG.info("All carrying = " + result);
        } catch (Exception e) {
            ExceptionHandler.handle(e);
        }
    }

    public void getFuelConsumption(double from, double to) {
        try {
            LOG.debug(Messages.getMessage(InfoEnum.GET_FUEL_CONSUMPTION) 
            		+ " from " + from + " to " + to + " called!");
            if (!Validator.validateAircompany(aircompany))
                throw new IllegalArgumentException();
            ArrayList<AirVehicle> result = new ArrayList();
            ArrayList<AirVehicle> planes = aircompany.getPlanes();
            System.out.println("Fuel consumption from " + from + " to " + to + ":");
            for (AirVehicle plane : planes) {
                if ((plane.getFuelConsumption() <= to) && (plane.getFuelConsumption() >= from)) {
                    result.add(plane);
                }
            }
            for (AirVehicle plane : result) {
                System.out.println("\t" + plane);
            }
        } catch (Exception e) {
            ExceptionHandler.handle(e);
        }
    }

    public void sortPlane(Comparator<AirVehicle> comparator) {
        try {
            LOG.debug(Messages.getMessage(InfoEnum.SORT_PLANE));
            if (!Validator.validateAircompany(aircompany))
                throw new IllegalArgumentException();
            ArrayList<AirVehicle> planes = aircompany.getPlanes();
            planes.sort(comparator);
            aircompany.setPlanes(planes);
            System.out.println("All planes sorted by " + ((PlaneComparator) comparator).getSortingItem().getTypeSort());
            System.out.println(aircompany);
            LOG.info("All planes sorted by " + ((PlaneComparator)comparator).getSortingItem().getTypeSort());
        } catch (Exception e) {
            ExceptionHandler.handle(e);
        }
    }
}
