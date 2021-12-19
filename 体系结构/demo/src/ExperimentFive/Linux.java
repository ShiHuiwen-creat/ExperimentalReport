package ExperimentFive;

/**
 * @author SHW
 * @date 2021/12/18 14:49
 */
public class Linux implements AbstractOSFictory{
    @Override
    public ButtonFictory createButton() {
        LinuxButton linux = new LinuxButton();
        System.out.println("Linux工厂开始创建button=========>");
        return linux;
    }

    @Override
    public TextFictory createText() {
        LinuxText linuxText = new LinuxText();
        System.out.println("Linux工厂开始创建text=========>");
        return linuxText;
    }
}
