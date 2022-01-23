package ExperimentThree.Five;

/**
 * @author SHW
 * @date 2021/12/27 23:48
 */
public class DataValidation extends Guolvqi{
    public DataValidation(Guolvqi successor) {
        super(successor);
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.DATAVALIDATION){
            System.out.println(request.getName() + "被数据校验过滤器处理");
            return;
        }
        if(request != null){
            this.successor.handleRequest(request);
        }
    }
}
