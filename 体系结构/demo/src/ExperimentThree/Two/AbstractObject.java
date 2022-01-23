package ExperimentThree.Two;

/**
 * @author SHW
 * @date 2021/12/23 19:42
 */
public abstract class AbstractObject {
    public abstract void add(AbstractObject element);
    public abstract void remove(AbstractObject element);
    public abstract void fillColor(String color);
    public abstract AbstractObject get(int index);

}
