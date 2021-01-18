package home.blackharold.collections;

import java.util.HashMap;
import java.util.Map;

public class ExperimentalMap {

    public static void main(String[] args) {
        int sensorId = 0;
        Map sensors = new HashMap();
        Sensor s = (Sensor) sensors.get(sensorId);
    }

}


class Sensor {
    String sensorId;

    private Map sensors = new HashMap();

    public Sensor(String sensorId) {
        this.sensorId = sensorId;
    }

    public String getSensorId(String id) {
        return (String) sensors.get(id);
    }
}
