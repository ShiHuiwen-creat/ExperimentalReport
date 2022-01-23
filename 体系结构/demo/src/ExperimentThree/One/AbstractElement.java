package ExperimentThree.One;

/**
 * @author SHW
 * @date 2021/12/23 19:02
 */
public abstract class AbstractElement {
    public abstract void handleMessage();
    public abstract void addElement(AbstractElement element);
    public abstract void removeElement(AbstractElement element);

    public abstract AbstractElement getElement(int index);


}
