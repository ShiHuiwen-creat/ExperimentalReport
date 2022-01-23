package ExperimentThree.Four;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author SHW
 * @date 2021/12/27 21:37
 */
public class Proxy implements AbstractLog{
    BusinessClass businessClass = new BusinessClass();
    public static String getCurrentTime()  {
        try {
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String now = sdf.format(date);
            Date time  = sdf.parse(now);
            String s = time.toString();
            return s;
        } catch (ParseException e){
            System.out.println("");
        }
        return null;
    }
    public void Log(){
        String time = getCurrentTime();
        System.out.println("当前时间为"+time);
    }
    @Override
    public void method() {
        Log();
        businessClass.method();
    }
}
