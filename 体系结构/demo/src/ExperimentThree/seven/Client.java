package ExperimentThree.seven;

/**
 * @author SHW
 * @date 2021/12/28 13:30
 */
public class Client
{
    public static void main(String[] args) {
        WordsCount wordsCount = new WordsCount();
        TextInformationStatisticsArea1 currentConditionsDisplay = new TextInformationStatisticsArea1(wordsCount);
        TextInformationStatisticsArea2 statisticsDisplay = new TextInformationStatisticsArea2(wordsCount);
        TextInformationStatisticsArea3 textInformationStatisticsArea3 = new TextInformationStatisticsArea3(wordsCount);

        wordsCount.setMeasurements();

    }
}
