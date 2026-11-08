import java.util.Scanner;

public class Console {

    private void printClientConsole() {
        System.out.println("Вас приветствует конструктор машины!");
        System.out.println("Соберите Ауди своей мечты!");
        System.out.println("Выберите, что вы хотите сделать:");
        System.out.println("1. Показать свою машину");
        System.out.println("2. Изменить вид");
//        System.out.println("3. Изменить мощность");
        System.out.println("3. Выйти в главное меню");
    }

    private void printManagerConsole() {
        System.out.println("1. Заказать товар");
        System.out.println("2. Вывести все имеющиеся товары");
        System.out.println("3. Выйти в главое меню");
    }

    public void printMainConsole() {
        System.out.println("Сделайте выбор, от какого лица вход:");
        System.out.println("1. Клиент");
        System.out.println("2. Менеджер по заказам товаров");
        System.out.println("3. Выход...");
    }

    public void printConsoleClient(Scanner scanner, Client client,
                                   WarehouseOfElement warehouse) {
        while (true) {
            printClientConsole();
            String choose1 = scanner.nextLine();
            if (choose1.equals("1")) {
                client.showTheCar();
            } else if (choose1.equals("2")) {
                System.out.println("Выберите из того, что есть:");
                warehouse.showElementsFromWarehouse();
                System.out.println("Выберите тип: ");
                String chooseType = scanner.nextLine();
                if (chooseType.isBlank() || !warehouse
                        .getElementsFromWarehouse().containsKey(chooseType)) {
                    System.out.println("Вы не ввели ничего или такого элемента нет!");
                    continue;
                }
                System.out.println("Выберите элемент: ");
                String chooseElement = scanner.nextLine();
                if (chooseElement.isBlank() || !warehouse
                        .getElementsFromWarehouse().get(chooseType)
                        .contains(chooseElement)) {
                    System.out.println("Вы ничего не ввели или такого элемента нет!");
                    continue;
                }
                client.changeTheCar(chooseType, chooseElement);
                warehouse.getElementsFromWarehouse()
                        .get(chooseType).remove(chooseElement);
                System.out.println("Элемент добавлен на вышу машину!");
            } else if (choose1.equals("3")) {
                System.out.println("Выход в главное меню...");
                break;
            }
        }
    }

    public void printManagerConsole(Scanner scanner, ProcurementManager manager,
                                    WarehouseOfElement warehouse) {
        while (true) {
            printManagerConsole();
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
                warehouse.showElementsFromWarehouse();
            } else if (choose2.equals("3")) {
                System.out.println("Выход в главное меню...");
                break;
            }
        }
    }
}
