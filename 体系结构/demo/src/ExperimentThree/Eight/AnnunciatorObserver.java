package ExperimentThree.Eight;

/**
 * @author SHW
 * @date 2021/12/28 15:48
 */
public class AnnunciatorObserver implements Observer{

    private Annunciator annunciator = new Annunciator();

    @Override
    public void alarm() {
        annunciator.alarm();
    }
}
