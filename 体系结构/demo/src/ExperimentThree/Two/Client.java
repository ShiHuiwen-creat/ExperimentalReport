package ExperimentThree.Two;

/**
 * @author SHW
 * @date 2021/12/23 19:52
 */
public class Client {
    public static void main(String[] args) {
        AbstractObject object1,object2,object3,object4;
        //初始颜色
        object1 = new Block("黄色");
        object2 = new Cube("");
        object3 = new Cylinder("");
        object4 = new Pyramid("");
        object1.add(object2);
        object1.add(object3);
        object1.add(object4);
//        改变颜色
        object1.fillColor("红色");
    }
}
