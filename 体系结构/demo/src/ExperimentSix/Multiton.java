package ExperimentSix;

import java.util.Random;

/**
 * @author SHW
 * @date 2021/12/18 15:54
 */
public class Multiton {
    private static Multiton array[] = {new Multiton(),new Multiton(),new Multiton(),new Multiton()};
    private Multiton(){}
    public static Multiton getInstance(){

        return array[random()];
    }
    public static int random(){
        Random random = new Random();
        int ran = Math.abs(random.nextInt())%4;
        return ran;
    }
    public static void main(String[] args) {

        Multiton multiton1 = Multiton.getInstance();
        Multiton multiton2 = Multiton.getInstance();
        Multiton multiton3 = Multiton.getInstance();
        System.out.println(multiton1 == multiton2);
        System.out.println(multiton1 == multiton3);
    }
}
