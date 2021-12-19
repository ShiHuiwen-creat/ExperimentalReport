package ExperimentEight;

import java.io.Serializable;

/**
 * @author SHW
 * @date 2021/12/18 17:16
 */
public class DeepPhoto implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void download(){
        System.out.println("下载深克隆图片");
    }
}
