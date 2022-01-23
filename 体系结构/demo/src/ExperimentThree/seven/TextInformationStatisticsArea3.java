package ExperimentThree.seven;

/**
 * @author SHW
 * @date 2021/12/28 13:28
 */
public class TextInformationStatisticsArea3 implements Observer {

    public TextInformationStatisticsArea3(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("于按照出现频次降序显示可编辑文本区中所出现的单词以及每个单词出现的次数");
    }
}
