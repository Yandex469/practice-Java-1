public class Console {

    public static void printMainConsole() {
        System.out.println("Сделайте выбор, от какого лица вход:");
        System.out.println("1. Клиент");
        System.out.println("2. Менеджер по заказам товаров");
        System.out.println("3. Выход...");
    }

    public static void printClientConsole() {
        System.out.println("Вас приветствует конструктор машины!");
        System.out.println("Соберите Ауди своей мечты!");
        System.out.println("Выберите, что вы хотите сделать:");
        System.out.println("1. Показать свою машину");
        System.out.println("2. Изменить вид");
//        System.out.println("3. Изменить мощность");
        System.out.println("3. Выйти в главное меню");
    }

    public static void printManagerConsole() {
        System.out.println("1. Заказать товар");
        System.out.println("2. Вывести все имеющиеся товары");
        System.out.println("3. Выйти в главое меню");
    }
}
