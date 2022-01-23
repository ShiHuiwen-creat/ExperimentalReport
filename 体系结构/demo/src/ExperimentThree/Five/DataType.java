package ExperimentThree.Five;

/**
 * @author SHW
 * @date 2021/12/27 23:47
 */
public class DataType extends Guolvqi{

    public DataType(Guolvqi successor) {
        super(successor);
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.DATATYPE){
            System.out.println(request.getName()+"被数据类型转换器处理");
            return;
        }
        if(successor != null){
            successor.handleRequest(request);
        }
    }
}
