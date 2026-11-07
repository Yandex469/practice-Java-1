import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WarehouseOfElement warehouseOfElement = new WarehouseOfElement();
        ProcurementManager manager = new ProcurementManager(warehouseOfElement);
        Client client = new Client();

        label:
        while (true) {
            Console.printMainConsole();
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    while (true) {
                        Console.printClientConsole();
                        String choose1 = scanner.nextLine();
                        if (choose1.equals("1")) {
                            client.showTheCar();
                        } else if (choose1.equals("2")) {
                            System.out.println("Выберите из того, что есть:");
                            warehouseOfElement.showElementsFromWarehouse();
                            System.out.println("Выберите тип: ");
                            String chooseType = scanner.nextLine();
                            if (chooseType.isBlank() || !warehouseOfElement
                                    .getElementsFromWarehouse().containsKey(chooseType)) {
                                System.out.println("Вы не ввели ничего или такого элемента нет!");
                                continue;
                            }
                            System.out.println("Выберите элемент: ");
                            String chooseElement = scanner.nextLine();
                            if (chooseElement.isBlank() || !warehouseOfElement
                                    .getElementsFromWarehouse().get(chooseType)
                                    .contains(chooseElement)) {
                                System.out.println("Вы ничего не ввели или такого элемента нет!");
                                continue;
                            }
                            client.changeTheCar(chooseType, chooseElement);
                            warehouseOfElement.getElementsFromWarehouse()
                                    .get(chooseType).remove(chooseElement);
                            System.out.println("Элемент добавлен на вышу машину!");
                        } else if (choose1.equals("3")) {
                            System.out.println("Выход в главное меню...");
                            break;
                        }
                    }
                    break;
                case "2":
                    while (true) {
                        Console.printManagerConsole();
                        String choose2 = scanner.nextLine();
                        if (choose2.equals("1")) {
                            System.out.println("Введите тип товара:");
                            String chooseType = scanner.nextLine();
                            if (chooseType.isBlank()) {
                                System.out.println("Вы ничего не ввели!");
                                continue;
                            }
                            System.out.println("Введите название товара:");
                            String chooseElement = scanner.nextLine();
                            if (chooseElement.isBlank()) {
                                System.out.println("Вы ничего не ввели!");
                                continue;
                            }
                            manager.orderElement(chooseType, chooseElement);
                            System.out.println("Элемент добавлен в склад!");
                        } else if (choose2.equals("2")) {
                            warehouseOfElement.showElementsFromWarehouse();
                        } else if (choose2.equals("3")) {
                            System.out.println("Выход в главное меню...");
                            break;
                        }
                    }
                    break;
                case "3":
                    System.out.println("Выход из системы...");
                    break label;
                default:
                    System.out.println("Неизвестная команда, попробуйте еще раз.");
                    break;
            }
        }
    }
}
