package ExperimentThree.One;

import java.util.ArrayList;

/**
 * @author SHW
 * @date 2021/12/23 19:12
 */
public class Group extends AbstractElement{
    public String mess;

    private ArrayList<AbstractElement> fileList=new ArrayList<AbstractElement>();

    public Group(String name){
        this.mess = name;

    }
    @Override
    public void handleMessage() {
        System.out.println("群 "+mess+"收到消息");
        for(AbstractElement file:fileList){
            file.handleMessage();
        }
    }

    @Override
    public void addElement(AbstractElement element) {
        fileList.add(element);
    }

    @Override
    public void removeElement(AbstractElement element) {
        fileList.remove(element);
    }

    @Override
    public AbstractElement getElement(int index) {
        AbstractElement element = fileList.get(index);
        return element;
    }
}
