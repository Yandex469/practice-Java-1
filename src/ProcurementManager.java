import java.util.ArrayList;

public class ProcurementManager {
    private final WarehouseOfElement warehouseOfElement;

    public ProcurementManager(WarehouseOfElement warehouseOfElement) {
        this.warehouseOfElement = warehouseOfElement;
    }

    public void orderElement(String elementType, String elementName) {
       ArrayList<String> newElementForCar = warehouseOfElement.getElementsFromWarehouse()
               .computeIfAbsent(elementType, key -> new ArrayList<>());

       newElementForCar.add(elementName);
    }
}
