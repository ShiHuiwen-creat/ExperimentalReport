package ExperimentThree.Eight;

/**
 * @author SHW
 * @date 2021/12/28 15:48
 */
public class CautionLightObserver implements Observer{
    private CautionLight cautionLight = new CautionLight();

    @Override
    public void alarm() {
        cautionLight.filcker();
    }


}
