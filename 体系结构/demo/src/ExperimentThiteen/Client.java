package ExperimentThiteen;

/**
 * @author SHW
 * @date 2021/12/19 19:51
 */
public class Client {


    public static void main(String[] args) {
        Import anImport = new ExcelImport();
        Import anImport1 = new WordImport();
        StatisticalAnalysis statisticalAnalysis = new StatisticalAnalysis1();
        StatisticalAnalysis statisticalAnalysis1 = new StatisticalAnalysis2();

        statisticalAnalysis.setAnImport(anImport);
        statisticalAnalysis1.setAnImport(anImport1);
//        StatisticalAnalysis.display();
        statisticalAnalysis.display();
        statisticalAnalysis1.display();
    }

}
