package ExperimentElven;

/**
 * @author SHW
 * @date 2021/12/19 18:20
 */
public class Circle extends Figure{
    @Override
    public void display() {
        System.out.println("调用 Circle 的 display 函数！");
        figureType.displayType();
    }
}
