package ExperimentFour;

/**
 * @author SHW
 * @date 2021/12/17 10:27
 */
public class HTTPConnection implements ConnectionClass{
    @Override
    public Protocol createConnection() {
        HTTP httpConnecion = new HTTP();
        System.out.println("创建一个HttpConnection的对象");
//        httpConnecion.display();
        return httpConnecion;
    }
}
