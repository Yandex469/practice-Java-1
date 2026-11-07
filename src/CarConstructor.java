import java.util.HashMap;

public class CarConstructor {
    HashMap<String, String> car;
    public CarConstructor() {
        car = new HashMap<>();
    }

    public HashMap<String, String> getElementsOfCar() {
        return car;
    }

    public void setElementOfCar(String key, String value) {
        car.put(key, value);
    }
}
