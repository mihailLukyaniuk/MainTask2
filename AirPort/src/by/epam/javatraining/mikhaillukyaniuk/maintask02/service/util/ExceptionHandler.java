/**
 * Created by Mikhail Lukyaniuk 31.03.2019
 */
package by.epam.javatraining.mikhaillukyaniuk.maintask02.service.util;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.enums.InfoEnum;

public class ExceptionHandler {
    private static Logger LOG = Logger.getLogger(ExceptionHandler.class);
    private static final String PATH_TO_XML = "log4j.xml";
    private static final int FAIL_STATUS = -1;

    static {
        new DOMConfigurator().doConfigure(PATH_TO_XML, LogManager.getLoggerRepository());
    }

    public static void start(){
        LOG.info(Messages.getMessage(InfoEnum.PROJECT_START));
    }

    public static void end(){
        LOG.info(Messages.getMessage(InfoEnum.PROJECT_END));
    }

    public static void handle(Throwable e,InfoEnum code){
        LOG.error(Messages.getMessage(code), e);
        System.exit(FAIL_STATUS);
    }

    public static void handle(Throwable e){
        LOG.error(e.getMessage(), e);
        System.exit(FAIL_STATUS);
    }
}
