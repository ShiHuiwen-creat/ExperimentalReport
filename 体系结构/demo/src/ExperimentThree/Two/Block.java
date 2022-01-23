package ExperimentThree.Two;

import java.util.ArrayList;

/**
 * @author SHW
 * @date 2021/12/23 19:45
 */
public class Block extends AbstractObject{
    private String color;
    private ArrayList<AbstractObject>abstractObjects = new ArrayList<>();
    public Block(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void add(AbstractObject element) {
        abstractObjects.add(element);
    }

    @Override
    public void remove(AbstractObject element) {
        abstractObjects.remove(element);
    }

    @Override
    public void fillColor(String color) {
        System.out.println("Block填充颜色"+color);
        for(AbstractObject abstractObject:abstractObjects){
            if(abstractObject instanceof Cube){
                ((Cube) abstractObject).setColor(color);
                System.out.println("Cube填充颜色"+((Cube) abstractObject).getColor());
            }else if(abstractObject instanceof Cylinder){
                ((Cylinder) abstractObject).setColor(color);
                System.out.println("Cylinder填充颜色"+((Cylinder) abstractObject).getColor());
            }else {
                ((Pyramid) abstractObject).setColor(color);
                System.out.println("Pyramid填充颜色"+((Pyramid) abstractObject).getColor());

            }
        }
    }

    @Override
    public AbstractObject get(int index) {
        return abstractObjects.get(index);
    }
}
