package ExperimentFive;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * @author SHW
 * @date 2021/12/18 14:51
 */
public class Client {
    public static void main(String[] args) throws ParserConfigurationException, IOException, ClassNotFoundException, SAXException, IllegalAccessException, InstantiationException {
        AbstractOSFictory abstractOSFictory;
        ButtonFictory buttonFictory;
        TextFictory textFictory;

        abstractOSFictory = (AbstractOSFictory)XMLUtil.getBean();
        buttonFictory = abstractOSFictory.createButton();
        buttonFictory.display();
        textFictory = abstractOSFictory.createText();
        textFictory.display();

        
    }
}
