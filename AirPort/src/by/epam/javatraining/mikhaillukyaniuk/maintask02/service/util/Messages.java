/**
 * Created by Mikhail Lukyaniuk 31.03.2019
 */
package by.epam.javatraining.mikhaillukyaniuk.maintask02.service.util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.enums.InfoEnum;

public class Messages {
    private static Properties props = new Properties();
    private static final String PATH_TO_PROPS = "resources/messages.properties";

    public static String getMessage(InfoEnum key){
        init();
        return props.getProperty(key.getValue());
    }

    private static void init(){
        try{
            props.load(new FileReader(new File(PATH_TO_PROPS)));
        }catch (IOException e){
            ExceptionHandler.handle(e);
        }
    }
}
