package ExperimentFive;

/**
 * @author SHW
 * @date 2021/12/18 14:50
 */
public class LinuxButton implements ButtonFictory{
    @Override
    public void display() {
        System.out.println("linux的按钮被创建");
    }
}
