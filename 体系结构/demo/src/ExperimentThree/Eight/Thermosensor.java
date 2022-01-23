package ExperimentThree.Eight;

/**
 * @author SHW
 * @date 2021/12/28 15:44
 */
public interface Thermosensor {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();
}
