package ExperimentThree.One;

/**
 * @author SHW
 * @date 2021/12/23 19:17
 */
public class Client {
    public static void main(String[] args) {
        AbstractElement element1,element2,element3,element4;
        element1 = new Member("皮卡丘");
        element2 = new Member("卡比兽");
        element3 = new Member("鸭嘴兽");
        element4 = new Group("小智");
        element4.addElement(element1);
        element4.addElement(element2);
        element4.addElement(element3);
        element4.handleMessage();
    }
}
