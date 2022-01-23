package ExperimentThree.seven;

/**
 * @author SHW
 * @date 2021/12/28 13:25
 */
public class TextInformationStatisticsArea1 implements Observer {

    public TextInformationStatisticsArea1(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("显示可编辑文本区中出现的单词总数量和字符总数量");
    }
}
