package ExperimentThree.Eight;

/**
 * @author SHW
 * @date 2021/12/28 15:48
 */
public class InsulatedDoorObserver implements Observer{
    private InsulatedDoor insulatedDoor;

    @Override
    public void alarm() {
        insulatedDoor.close();
    }
}
