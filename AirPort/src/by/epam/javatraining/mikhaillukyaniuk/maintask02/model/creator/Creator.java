/**
 * Created by Mikhail Lukyaniuk 31.03.2019
 */
package by.epam.javatraining.mikhaillukyaniuk.maintask02.model.creator;

import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities.AirVehicle;

public interface Creator {
	AirVehicle getResult();
    void setArg(String name, String arg);

}
