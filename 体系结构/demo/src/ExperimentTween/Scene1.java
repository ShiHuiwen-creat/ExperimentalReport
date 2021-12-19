package ExperimentTween;

/**
 * @author SHW
 * @date 2021/12/19 19:00
 */
public class Scene1 implements ScenesFictory{
    @Override
    public void createWeather() {
        System.out.println("进入场景1！");
        WeatherFictory mapFictory = new Weather1();


        mapFictory.display();

    }

    @Override
    public void createMap() {
        System.out.println("进入场景1！");
        MapFictory mapFictory = new Map1();


        mapFictory.display();

    }

    @Override
    public void createSound() {
        System.out.println("进入场景1！");
        SoundFictory mapFictory = new Sound1();


        mapFictory.display();

    }
}
