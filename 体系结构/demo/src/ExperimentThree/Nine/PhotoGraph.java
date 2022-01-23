package ExperimentThree.Nine;

/**
 * @author SHW
 * @date 2021/12/28 21:04
 */
public class PhotoGraph {
    private Filter filter;
    public void perform() {
        if (filter != null) {
            filter.behavior();
        }
    }

    public void setQuackBehavior(Filter quackBehavior) {
        this.filter = quackBehavior;
    }
}
