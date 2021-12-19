package ExperimentTen.ClassAdaper;

/**
 * @author SHW
 * @date 2021/12/19 17:45
 */
public class Adatper implements Target{
    private Adatpee adatpee;
    @Override
    public String encode(String mess) {

        return adatpee.newEncode("");
    }

    @Override
    public String decode(String mess) {
        return adatpee.newDecoder("");
    }
}
