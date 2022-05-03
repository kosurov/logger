import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");

        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");
        int listSize = Integer.parseInt(scanner.nextLine());
        System.out.print("Введите верхнюю границу для значений: ");
        int maxValue = Integer.parseInt(scanner.nextLine());

        logger.log("Создаем и наполняем список");
        List<Integer> list = fillList(listSize, maxValue);
        System.out.print("Вот случайный список: ");
        printList(list);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int threshold = Integer.parseInt(scanner.nextLine());

        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(threshold);
        List<Integer> filteredList = filter.filterOut(list);

        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список: ");
        printList(filteredList);
        logger.log("Завершаем программу");
    }

    public static List<Integer> fillList(int listSize, int maxValue) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < listSize; i++) {
            list.add(random.nextInt(maxValue));
        }
        return list;
    }

    public static void printList(List<Integer> list) {
        for (int e : list) {
            System.out.print(e + " ");
        }
        System.out.print("\n");
    }
}
