/**
 * Created by Mikhail Lukyaniuk 31.03.2019
 */
package by.epam.javatraining.mikhaillukyaniuk.maintask02.model.enums;

public enum  InfoEnum {
    PROJECT_START("project.start"),
    PROJECT_END("project.end"),
    VALIDATE_FAIL("validate.fail"),
    CREATE_AIRCOMPANY("create.aircompany"),
    DESTROYER_PLANE_CREATOR_CALLED("destroyer.plane.builder.called"),
    PASSENGER_PLANE_CREATOR_CALLED("passenger.plane.builder.called"),
    TRANSPORT_PLANE_CREATOR_CALLED("transport.plane.builder.called"),
    STORMTROOPER_PLANE_CREATOR_CALLED("stormtrooper.plane.builder.called"),
    GET_ALL_CARRYING("get.all.carrying.called"),
    SORT_PLANE("sort.plane"),
    GET_FUEL_CONSUMPTION("get.fuel.consumption");

    String value;

    InfoEnum(String key) {
        this.value = key;
    }

    public String getValue(){
        return this.value;
    }
}
