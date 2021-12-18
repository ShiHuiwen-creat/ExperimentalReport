package ExperimentFour;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * @author SHW
 * @date 2021/12/17 10:32
 */
public class XMLUtil {
    public static Object getBean() throws ParserConfigurationException, IOException, SAXException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document;
        document = (Document) documentBuilder.parse(new File("src/ExperimentFour/config.xml"));

        NodeList nodeList = document.getElementsByTagName("className");
        Node classNode = nodeList.item(0).getFirstChild();
        String cName = classNode.getNodeValue();
        System.out.println(cName);
        Class c = Class.forName("ExperimentFour."+cName);
        System.out.println(c);
        Object object = c.newInstance();
        return object;
    }


}
