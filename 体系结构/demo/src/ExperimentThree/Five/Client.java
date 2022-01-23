package ExperimentThree.Five;

/**
 * @author SHW
 * @date 2021/12/27 23:47
 */
public class Client {
    public static void main(String[] args) {
        Guolvqi guolvqi1 = new DataType(null);
        Guolvqi guolvqi2 = new DataValidation(guolvqi1);
        Guolvqi guolvqi3 = new DataValidation(guolvqi2);

        Request request1 = new Request(RequestType.DATATYPE,"鸣人");
        Request request2 = new Request(RequestType.DATAVALIDATION,"佐助");
        Request request3 = new Request(RequestType.DATATYPE,"皮卡丘");

        guolvqi3.handleRequest(request1);
        guolvqi3.handleRequest(request2);
        guolvqi3.handleRequest(request3);

        System.out.println("责任链模式真好！");
    }


}
