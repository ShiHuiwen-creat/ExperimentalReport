package ExperimentThree.seven;

/**
 * @author SHW
 * @date 2021/12/28 13:21
 */
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();


}
