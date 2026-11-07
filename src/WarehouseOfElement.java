import java.util.ArrayList;
import java.util.HashMap;

public class WarehouseOfElement {
    private final HashMap<String, ArrayList<String>> map = new HashMap<>();

    public HashMap<String, ArrayList<String>> getElementsFromWarehouse() {
        return map;
    }

    public void showElementsFromWarehouse() {
        for (String key : map.keySet()) {
            if (map.get(key).isEmpty()) {
                map.remove(key);
            } else {
                System.out.println(key + ": " + map.get(key));
            }
        }
    }
}
