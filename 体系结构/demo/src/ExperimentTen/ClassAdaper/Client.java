package ExperimentTen.ClassAdaper;

/**
 * @author SHW
 * @date 2021/12/19 17:46
 */
public class Client {
    public static void main(String[] args) {
        Target target = new Adatper();
        String s = target.encode("");
        String ss = target.decode("");
    }
}
