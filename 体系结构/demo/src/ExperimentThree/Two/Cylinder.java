package ExperimentThree.Two;

/**
 * @author SHW
 * @date 2021/12/23 19:46
 */
public class Cylinder extends AbstractObject{
    private String color;
    public Cylinder(String color){
        this.color = color;
    }
    @Override
    public void add(AbstractObject element) {

    }

    @Override
    public void remove(AbstractObject element) {

    }

    @Override
    public void fillColor(String color) {
        System.out.println("Cylinder填充颜色："+color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public AbstractObject get(int index) {
        return null;
    }
}
