package ExperimentThree.seven;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SHW
 * @date 2021/12/28 13:23
 */
public class WordsCount implements Subject {
    private List<Observer> observers;


    public WordsCount() {
        observers = new ArrayList<>();
    }

    public void setMeasurements() {

        notifyObserver();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observers) {
            o.update();
        }
    }
}
