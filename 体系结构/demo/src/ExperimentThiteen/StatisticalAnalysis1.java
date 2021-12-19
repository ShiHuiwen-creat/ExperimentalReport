package ExperimentThiteen;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author SHW
 * @date 2021/12/19 19:46
 */
public class StatisticalAnalysis1 extends StatisticalAnalysis{
    @Override
    public void display() {
        System.out.println("以分析整套试卷的成绩分布");
        anImport.display();
    }
}
