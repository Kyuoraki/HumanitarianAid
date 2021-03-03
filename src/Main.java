import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cargoCapacity = 12;
        int caseCapacity = 27;
        int train = 1;
        int container = 1;
        System.out.println("Введите кол-во ящиков.");
        Scanner scanner = new Scanner(System.in);
        int box = scanner.nextInt();
        if (box > 0) {
            System.out.println("Грузовик " + train + ":");
            System.out.println("\t Контейнер " + container + ":");
            for (int i = 1; i <= box; i++) {
                System.out.println("\t \t Ящик " + i);
                if (i % (cargoCapacity * caseCapacity) == 0) {
                    train += 1;
                    System.out.println("Грузовик: " + train);
                }
                if (i % caseCapacity == 0) {
                    container += 1;
                    System.out.println("\t Контейнер " + container + ":");
                }
            }
            System.out.println("Необходимо: \n грузовиков - " + train + " шт.\n контейнеров - " + container + " шт.");
        } else {
            System.out.println("Нет ящиков!");
        }
    }
}
