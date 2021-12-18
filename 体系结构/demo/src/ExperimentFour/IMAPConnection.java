package ExperimentFour;

/**
 * @author SHW
 * @date 2021/12/17 10:25
 */
public class IMAPConnection implements ConnectionClass {

    @Override
    public Protocol createConnection() {
        IMAP connecion = new IMAP();
        System.out.println("创建一个IMAPConnection的对象");
//        connecion.display();
        return connecion;


    }
}
