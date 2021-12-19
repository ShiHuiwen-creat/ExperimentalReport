package ExperimentTween;

/**
 * @author SHW
 * @date 2021/12/19 18:59
 */
public class Client {
    public static void main(String[] args) {
        ScenesFictory scenesFictory = new Scene1();
        scenesFictory.createMap();
        scenesFictory.createSound();
        scenesFictory.createWeather();

        ScenesFictory scenesFictory1 = new Scene2();
        scenesFictory1.createMap();
        scenesFictory1.createSound();
        scenesFictory1.createWeather();
    }
}
