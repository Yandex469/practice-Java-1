

public class Client {
    CarConstructor carConstructor;
    public Client() {
        carConstructor = new CarConstructor();
    }

    public void showTheCar() {
        if (carConstructor.getElementsOfCar().isEmpty()) {
            System.out.println("У машины заводской комплект.");
            return;
        }
        for (String typeOfEl : carConstructor.getElementsOfCar().keySet()) {
            System.out.println(typeOfEl + " : " + carConstructor
                    .getElementsOfCar().get(typeOfEl));
        }
    }

    public void changeTheCar(String typeOfEl, String element) {
        carConstructor.setElementOfCar(typeOfEl, element);
    }
}
