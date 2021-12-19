package ExperimentEight;

/**
 * @author SHW
 * @date 2021/12/18 17:16
 */
public class ShallowResume implements Cloneable{
    private String name;
    private ShallowPhoto shallowPhoto;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShallowPhoto getShallowPhoto() {
        return shallowPhoto;
    }

    public void setShallowPhoto(ShallowPhoto shallowPhoto) {
        this.shallowPhoto = shallowPhoto;
    }

    @Override
    public ShallowResume clone() throws CloneNotSupportedException {
        return (ShallowResume) super.clone();
    }


}
