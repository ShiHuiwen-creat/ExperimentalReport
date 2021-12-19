package ExperimentEight;

/**
 * @author SHW
 * @date 2021/12/18 17:30
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        //浅克隆
        ShallowResume shallowResume1 = new ShallowResume() ;
        ShallowResume shallowResume2 = shallowResume1.clone();
        ShallowPhoto shallowPhoto1 = shallowResume1.getShallowPhoto();
        ShallowPhoto shallowPhoto2 = shallowResume2.getShallowPhoto();
        shallowPhoto1.download();
        System.out.println(shallowPhoto1== shallowPhoto2);

        //深克隆
        DeepResume deepResume1 = new DeepResume();
        DeepResume deepResume2 = deepResume1.deepclone();
        deepResume2.getDeepPhoto().download();
        System.out.println(false);
    }
}
