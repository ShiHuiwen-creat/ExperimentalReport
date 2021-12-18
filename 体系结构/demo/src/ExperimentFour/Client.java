package ExperimentFour;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 *@author SHW
 *@date 2021/12/17 10:28
 */

public class Client {
    public static void main(String[] args) throws ParserConfigurationException, IOException, ClassNotFoundException, SAXException, IllegalAccessException, InstantiationException {
        //Object ob = XMLUtil.getBean();
        ConnectionClass connectionClass;
        Protocol protocol;
        connectionClass = (ConnectionClass)XMLUtil.getBean();
        protocol = connectionClass.createConnection();
        protocol.display();

    }
}
