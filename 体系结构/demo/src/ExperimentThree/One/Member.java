package ExperimentThree.One;

import java.util.ArrayList;

/**
 * @author SHW
 * @date 2021/12/23 19:06
 */
public class Member extends AbstractElement{
    public String mess;
    public Member(String name){
        this.mess = name;
    }
    @Override
    public void handleMessage() {
        System.out.println("个体"+mess+"收到分享的内容");
    }

    @Override
    public void addElement(AbstractElement element) {

    }

    @Override
    public void removeElement(AbstractElement element) {

    }

    @Override
    public AbstractElement getElement(int index) {
        return null;
    }
}
