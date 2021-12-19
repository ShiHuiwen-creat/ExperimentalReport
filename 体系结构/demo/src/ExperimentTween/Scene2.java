package ExperimentTween;

/**
 * @author SHW
 * @date 2021/12/19 19:00
 */
public class Scene2 implements ScenesFictory{
    @Override
    public void createWeather() {
        System.out.println("进入场景2！");

        WeatherFictory mapFictory1 = new Weather2();


        mapFictory1.display();
    }

    @Override
    public void createMap() {
        System.out.println("进入场景2！");

        MapFictory mapFictory1 = new Map2();


        mapFictory1.display();
    }

    @Override
    public void createSound() {
        System.out.println("进入场景2！");

        SoundFictory mapFictory1 = new Sound2();


        mapFictory1.display();
    }
}
