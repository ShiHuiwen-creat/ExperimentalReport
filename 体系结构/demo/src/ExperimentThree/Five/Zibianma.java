package ExperimentThree.Five;

/**
 * @author SHW
 * @date 2021/12/27 23:47
 */
public class Zibianma extends Guolvqi{
    public Zibianma(Guolvqi successor) {
        super(successor);
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.ZIFUJI){
            System.out.println(request.getName() +"被字符编码处理");
            return;
        }
        if(request != null){
            this.successor.handleRequest(request);
        }
    }
}
