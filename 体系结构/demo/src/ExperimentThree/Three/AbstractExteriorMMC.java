package ExperimentThree.Three;

/**
 * @author SHW
 * @date 2021/12/23 20:59
 */
public class AbstractExteriorMMC extends AbstractExterior{
    private TongxunluManager tongxunluManager;
    private DuanxinManager duanxinManager;
    @Override
    public void click() {
        System.out.println("一键备份MMC");
        this.NewCreate();
        tongxunluManager.backup();
        duanxinManager.backup();
    }

    public void NewCreate(){
        tongxunluManager = new TongxunluManager();
        duanxinManager = new DuanxinManager();
    }
}
