package ExperimentElven;

/**
 * @author SHW
 * @date 2021/12/19 18:19
 */
public class Triangle extends Figure{
    @Override
    public void display() {
        System.out.println("调用 Triangle 的 display 函数！");
        figureType.displayType();
    }
}
