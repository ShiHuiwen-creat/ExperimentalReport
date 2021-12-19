package ExperimentFive;

/**
 * @author SHW
 * @date 2021/12/18 14:49
 */
public class Windows implements AbstractOSFictory{
    @Override
    public ButtonFictory createButton() {
        WondowsButton wondowsButton = new WondowsButton();
        System.out.println("Window工厂开始创建button=========>");
        return wondowsButton;
    }

    @Override
    public TextFictory createText() {
        WindowsText windowsText = new WindowsText();
        System.out.println("window工厂开始创建text=========>");
        return windowsText;
    }
}
