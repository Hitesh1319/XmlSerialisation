import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.apache.juneau.xml.XmlSerializer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.crypto.Data;
import javax.xml.crypto.dsig.XMLObject;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
//        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//        try {
//            DocumentBuilder builder = factory.newDocumentBuilder();
//            Document document =  builder.parse(new File("C:\\Users\\HiteshSharma\\IdeaProjects\\PlainOldJavaObject\\src\\main\\java\\Data.xml"));
//            document.getDocumentElement().normalize();
//            NodeList carsDetail = document.getElementsByTagName("name");
//            for(int i=0; i< carsDetail.getLength();i++){
//                Node car = carsDetail.item(i);
//                if(car.getNodeType() == Node.ELEMENT_NODE) {
//                    Element carElement = (Element) car;
//                    System.out.println("Car Name: "+carElement.getChildNodes());
//                    for(int j=0; j<carsDetail.getLength();j++){
//                        Node detail = carsDetail.item(j);
//                        if(detail.getNodeType() == Node.ELEMENT_NODE){
//                            Element detailElement = (Element) detail;
//                            System.out.println(""+detailElement.getTagName());
//                        }
//                    }
//                }
//            }
//        } catch (ParserConfigurationException | IOException | SAXException e) {
//            throw new RuntimeException(e);
//        }
        File file = new File("C:\\Users\\HiteshSharma\\IdeaProjects\\PlainOldJavaObject\\src\\main\\java\\Data.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(file);

        doc.getDocumentElement().normalize();
        NodeList nodeList = doc.getElementsByTagName("cars");
        List<Cars> car = new ArrayList<>();
        for (int itr = 0; itr < nodeList.getLength(); itr++) {
            Node node = nodeList.item(itr);
            System.out.println("Node Name :" + node.getNodeName());
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) node;
                NodeList name = doc.getElementsByTagName("name");
                NodeList colour = doc.getElementsByTagName("colour");
                NodeList engine = doc.getElementsByTagName("engine");
                Cars cars = new Cars(colour.toString(), name.toString(), engine.toString());
                System.out.println("Car name: " + eElement.getElementsByTagName("name").item(0).getTextContent());
                System.out.println("Car colour: " + eElement.getElementsByTagName("colour").item(0).getTextContent());
                System.out.println("Car engine: " + eElement.getElementsByTagName("engine").item(0).getTextContent());
            }
        }
    }
}