package ExperimentThree.Ten;

/**
 * @author SHW
 * @date 2021/12/28 22:39
 */
public abstract  class DataMiningTool {
    public void ReadData(){
        System.out.println("读取数据");
    }

    public void ConverDataType(){
        System.out.println("转换数据格式");
    }

    public abstract void Select();

    public void display(){
        System.out.println("展示数据");
    }

    //模板方法
    public void handle(){
        ReadData();
        ConverDataType();
        Select();
        display();
    }


}
