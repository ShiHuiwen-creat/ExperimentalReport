package ExperimentThree.Four;

/**
 * @author SHW
 * @date 2021/12/27 21:43
 */
public class Client {
    public static void main(String[] args) {
        AbstractLog abstractLog = new Proxy();
        abstractLog.method();
    }


}
