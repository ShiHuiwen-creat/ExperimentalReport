package ExperimentFour;

/**
 * @author SHW
 * @date 2021/12/17 10:27
 */
public class POP3Connection implements ConnectionClass{
    @Override
    public Protocol createConnection() {
        POP3 connecion = new POP3();
        System.out.println("创建一个POP3Connection的对象");
        connecion.display();
        return connecion;
    }
}
