package ExperimentThree.Eight;

/**
 * @author SHW
 * @date 2021/12/28 15:48
 */
public class SecurityDoorObserver implements Observer{

    private SecurityDoor securityDoor = new SecurityDoor();

    @Override
    public void alarm() {
        securityDoor.open();
    }
}
