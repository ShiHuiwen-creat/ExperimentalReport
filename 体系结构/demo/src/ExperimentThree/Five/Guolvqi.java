package ExperimentThree.Five;

/**
 * @author SHW
 * @date 2021/12/27 23:47
 */
public abstract class Guolvqi {
    protected Guolvqi successor;

    public Guolvqi(Guolvqi successor){
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);
}
