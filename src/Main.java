import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        Scanner scanner = new Scanner(System.in);// Немного посвоевольничать
        System.out.println("Введите ОС Вашего устройства, где IOS это 0 а Android это 1");
        int clientOS = scanner.nextInt();
        int clientIOS = 0;
        int clientAndroid = 1;
        if (clientOS == clientIOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == clientAndroid) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Для Вашей ОС нет подходяшей программы");
        }
    }

    public static void task2() {
        int clientIOS = 0;
        int clientAndroid = 1;
        int year = 2015;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ОС Вашего устройства, где IOS это 0 а Android это 1");
        int clientOS = scanner.nextInt();
        System.out.println("Введите год производства Вашего устройства");
        int clientDeviceYear = scanner.nextInt();
        if (clientOS == clientIOS && clientDeviceYear >= year) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == clientIOS) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == clientAndroid && clientDeviceYear >= year) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == clientAndroid) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        int year = 2022;
        boolean leapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (leapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка займет 1 дня");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Доставка займет 2 дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Доставка займет 3 дня");
        }
    }

    public static void task5() {
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }

}
