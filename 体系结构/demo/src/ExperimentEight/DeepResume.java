package ExperimentEight;

import java.io.*;

/**
 * @author SHW
 * @date 2021/12/18 17:16
 */
public class DeepResume implements Serializable {
    private String name;
    private DeepPhoto deepPhoto ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepPhoto getDeepPhoto() {
        return deepPhoto;
    }

    public void setDeepPhoto(DeepPhoto deepPhoto) {
        this.deepPhoto = deepPhoto;
    }

    public DeepResume deepclone(){
        DeepResume deepCloneResume = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            deepCloneResume = (DeepResume) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return deepCloneResume;
    }
}
