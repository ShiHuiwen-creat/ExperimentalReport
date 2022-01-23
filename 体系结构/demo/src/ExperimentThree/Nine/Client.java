package ExperimentThree.Nine;

/**
 * @author SHW
 * @date 2021/12/28 21:25
 */
public class Client {
    public static void main(String[] args) {
        PhotoGraph photoGraph = new PhotoGraph();
        photoGraph.setQuackBehavior(new BlackWhiteFilter());
        photoGraph.perform();

        photoGraph.setQuackBehavior(new MonochromaticFilter());
        photoGraph.perform();


    }
}
