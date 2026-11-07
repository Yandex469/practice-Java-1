

public class Client {
    CarConstructor carConstructor;
    public Client() {
        carConstructor = new CarConstructor();
    }

    public void showTheCar() {
        for (String typeOfEl : carConstructor.getElementsOfCar().keySet()) {
            System.out.println(typeOfEl + " : " + carConstructor
                    .getElementsOfCar().get(typeOfEl));
        }
    }

    public void changeTheCar(String typeOfEl, String element) {
        carConstructor.setElementOfCar(typeOfEl, element);
    }
}
