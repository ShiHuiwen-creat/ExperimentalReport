package ExperimentFive;

/**
 * @author SHW
 * @date 2021/12/18 14:50
 */
public class MacOSButton implements ButtonFictory{
    @Override
    public void display() {
        System.out.println("macosButton被创建！");
    }
}
