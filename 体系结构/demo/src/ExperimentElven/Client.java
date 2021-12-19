package ExperimentElven;

/**
 * @author SHW
 * @date 2021/12/19 18:20
 */
public class Client {
    public static void main(String[] args) {
        //平面圆
        Figure figure = new Circle();
        figure.setFigureType(new PlaneFigure());
        figure.display();

        //立体长方形
        Figure figure1 = new Rectangle();
        figure1.setFigureType(new SolidFigure());
//        System.out.println(figure1.display());
        figure1.display();
    }
}
