/**
 * Created by Mikhail Lukyaniuk 31.03.2019
 */
package by.epam.javatraining.mikhaillukyaniuk.maintask02.service.util;

import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.creator.CreateWorker;
import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.creator.Creator;
import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities.Aircompany;
import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities.civil.passenger.PassengerPlane;
import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities.civil.transport.TransportPlane;
import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities.military.destroyer.DestroyerPlane;
import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities.military.stormtrooper.StormtrooperPlane;
import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.enums.InfoEnum;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

import org.apache.log4j.*;

public class XMLPlanesReader {

    private static org.apache.log4j.Logger LOG = Logger.getLogger(XMLPlanesReader.class);
    private Creator creator;
    Aircompany aircompany;


    public Aircompany read() throws NumberFormatException, IllegalArgumentException, IOException, SAXException, ParserConfigurationException {
        Aircompany aircompany = new Aircompany();
        File file = new File("AirlineProject/resources/aircompany.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = null;
        documentBuilder = factory.newDocumentBuilder();
        Document document = documentBuilder.parse(file);

        NodeList nodeList = document.getElementsByTagName("plane");

        for (int i = 0; nodeList.getLength() > i; i++) {
            Node node = nodeList.item(i);
            Element element = (Element) node;
            String type = element.getAttribute("type");
            creator = CreateWorker.newCreator(type);

            for (int q = 1; q < element.getChildNodes().getLength(); q += 2) {
                String argName = element.getChildNodes().item(q).getNodeName();
                String argValue = element.getChildNodes().item(q).getTextContent();
                creator.setArg(argName, argValue);
            }
            switch (type) {
                case "DestroyerPlane":
                    if (!Validator.validateDestroyerPlane((DestroyerPlane)creator.getResult()))
                        throw new IllegalArgumentException(Messages.getMessage(InfoEnum.VALIDATE_FAIL));
                    break;
                case "StormtrooperPlane":
                    if (!Validator.validateStormtrooperPlane((StormtrooperPlane) creator.getResult()))
                        throw new IllegalArgumentException(Messages.getMessage(InfoEnum.VALIDATE_FAIL));
                    break;
                case "PassengerPlane":
                    if (!Validator.validatePassengerPlane((PassengerPlane) creator.getResult()))
                        throw new IllegalArgumentException(Messages.getMessage(InfoEnum.VALIDATE_FAIL));
                    break;
                case "TransportPlane":
                    if (!Validator.validateTransportPlane((TransportPlane) creator.getResult()))
                        throw new IllegalArgumentException(Messages.getMessage(InfoEnum.VALIDATE_FAIL));
                    break;

            }
            aircompany.add(creator.getResult());
        }
        return aircompany;
    }
}
