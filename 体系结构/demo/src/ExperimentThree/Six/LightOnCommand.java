package ExperimentThree.Six;

/**
 * @author SHW
 * @date 2021/12/28 12:59
 */
public class LightOnCommand implements Command{
        Light light;

        public LightOnCommand(Light light) {
            this.light = light;
        }

        @Override
        public void execute() {
            light.on();
        }
    }
