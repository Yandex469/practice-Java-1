import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WarehouseOfElement warehouseOfElement = new WarehouseOfElement();
        ProcurementManager manager = new ProcurementManager(warehouseOfElement);
        Console console = new Console();
        Client client = new Client();

        label:
        while (true) {
            console.printMainConsole();
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    console.printConsoleClient(scanner, client, warehouseOfElement);
                    break;
                case "2":
                    console.printManagerConsole(scanner, manager, warehouseOfElement);
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
