package ExperimentThree.seven;

/**
 * @author SHW
 * @date 2021/12/28 13:27
 */
public class TextInformationStatisticsArea2 implements Observer {

    public TextInformationStatisticsArea2(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("用于显示可编辑文本区中所出现的单词（去重后按照字典序排序）");
    }
}