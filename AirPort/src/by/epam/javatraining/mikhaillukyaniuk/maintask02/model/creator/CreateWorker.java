/**
 * Created by Mikhail Lukyaniuk 31.03.2019
 */
package by.epam.javatraining.mikhaillukyaniuk.maintask02.model.creator;

public class CreateWorker {
    public static Creator newCreator(String name) {
        switch (name) {
            case "DestroyerPlane":
                return new DestroyerPlaneCreator();
            case "StormtrooperPlane":
                return new StormtrooperPlaneCreator();
            case "PassengerPlane":
                return new PassengerPlaneCreator();
            case "TransportPlane":
                return new TransportPlaneCreator();
        }
        return null;
    }
}
