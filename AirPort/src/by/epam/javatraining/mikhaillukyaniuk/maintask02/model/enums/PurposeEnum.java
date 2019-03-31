/**
 * Created by Mikhail Lukyaniuk 31.03.2019
 */
package by.epam.javatraining.mikhaillukyaniuk.maintask02.model.enums;

public enum PurposeEnum{
    DESTROYER{
        {this.value="destroyer";}
    },
    STORMTROOPER{
        {this.value="stormtrooper";}
    },
    TRANSPORT{
        {this.value="transport";}
    },
    PASSENGER{
        {this.value="passenger";}
    };

    String value;

    public String getValue() {
        return this.value;
    }


}

