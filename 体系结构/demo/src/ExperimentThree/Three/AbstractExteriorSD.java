package ExperimentThree.Three;

/**
 * @author SHW
 * @date 2021/12/23 20:59
 */
public class AbstractExteriorSD extends AbstractExterior{
    private NewTongxunluManager newTongxunluManager;
    private NewDuanxinManager newDuanxinManager;
    @Override
    public void click() {
        this.NewCreate();
        System.out.println("一键备份SD");
        newTongxunluManager.backup();
        newDuanxinManager.backup();
    }

    public void NewCreate(){
        newTongxunluManager = new NewTongxunluManager();
        newDuanxinManager = new NewDuanxinManager();
    }
}
