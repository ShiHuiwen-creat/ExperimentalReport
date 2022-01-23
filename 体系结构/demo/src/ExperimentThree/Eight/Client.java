package ExperimentThree.Eight;

/**
 * @author SHW
 * @date 2021/12/28 16:12
 */
public class Client {
    public static void main(String[] args) {
        CThermosensor cThermosensor = new CThermosensor();
        Observer observer1 = new AnnunciatorObserver();
        cThermosensor.registerObserver(observer1);
        Observer observer2 = new CautionLightObserver();
        cThermosensor.registerObserver(observer2);
        Observer observer3 = new SecurityDoorObserver();
        cThermosensor.registerObserver(observer3);
        cThermosensor.notifyObserver();
    }
}
