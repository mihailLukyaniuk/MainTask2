package by.epam.javatraining.mikhaillukyaniuk.maintask02.controll;

import by.epam.javatraining.mikhaillukyaniuk.maintask02.service.util.ExceptionHandler;
import by.epam.javatraining.mikhaillukyaniuk.maintask02.service.util.PlaneComparator;



public class StartProgramm {
	
    public static void main(String[] args) {
        ExceptionHandler.start();
        PlaneController controller = new PlaneController();
        controller.createAircompany();
        controller.createAircompany();
        controller.getCarrying();
        controller.getFuelConsumption(200, 500);
        PlaneComparator planeComparator = new PlaneComparator(PlaneComparator.ItemEnum.DISTANCE_OF_FLIGHT);
        controller.sortPlane(planeComparator);
        ExceptionHandler.end();
        
    }
}
 





