package ExperimentFive;

import javax.crypto.Mac;

/**
 * @author SHW
 * @date 2021/12/18 14:49
 */
public class MacOS implements AbstractOSFictory{
    @Override
    public ButtonFictory createButton() {
        MacOSButton macOSButton = new MacOSButton();
        System.out.println("Mac工厂开始创建button=========>");
        return macOSButton;
    }

    @Override
    public TextFictory createText() {
        MacOSText macOSText = new MacOSText();
        System.out.println("Mac工厂开始创建text=========>");
        return macOSText;
    }
}
