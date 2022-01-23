package ExperimentThree.Three;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * @author SHW
 * @date 2021/12/23 21:00
 */
public class Client {
    public static void main(String[] args) throws ParserConfigurationException, IOException, ClassNotFoundException, SAXException, IllegalAccessException, InstantiationException {
        AbstractExterior abstractExterior;
        abstractExterior = (AbstractExterior)XMLUtil.getBean();
//        System.out.println();
        abstractExterior.click();
    }
}
