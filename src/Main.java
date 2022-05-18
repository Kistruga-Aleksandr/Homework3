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
        Scanner scanner = new Scanner(System.in);// ������� ����������������
        System.out.println("������� �� ������ ����������, ��� IOS ��� 0 � Android ��� 1");
        int clientOS = scanner.nextInt();
        int clientIOS = 0;
        int clientAndroid = 1;
        if (clientOS == clientIOS) {
            System.out.println("���������� ������ ���������� ��� iOS �� ������");
        } else if (clientOS == clientAndroid) {
            System.out.println("���������� ������ ���������� ��� Android �� ������");
        } else {
            System.out.println("��� ����� �� ��� ���������� ���������");
        }
    }

    public static void task2() {
        int clientIOS = 0;
        int clientAndroid = 1;
        int year = 2015;
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� �� ������ ����������, ��� IOS ��� 0 � Android ��� 1");
        int clientOS = scanner.nextInt();
        System.out.println("������� ��� ������������ ������ ����������");
        int clientDeviceYear = scanner.nextInt();
        if (clientOS == clientIOS && clientDeviceYear >= year) {
            System.out.println("���������� ������ ���������� ��� iOS �� ������");
        } else if (clientOS == clientIOS) {
            System.out.println("���������� ����������� ������ ���������� ��� iOS �� ������");
        } else if (clientOS == clientAndroid && clientDeviceYear >= year) {
            System.out.println("���������� ������ ���������� ��� Android �� ������");
        } else if (clientOS == clientAndroid) {
            System.out.println("���������� ����������� ������ ���������� ��� Android �� ������");
        }
    }

    public static void task3() {
        int year = 2022;
        boolean leapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (leapYear) {
            System.out.println(year + " ��� �������� ����������");
        } else {
            System.out.println(year + " ��� �� �������� ����������");
        }
    }

    public static void task4() {
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("�������� ������ 1 ���");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("�������� ������ 2 ���");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("�������� ������ 3 ���");
        }
    }

    public static void task5() {
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("����");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("�����");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("����");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("�����");
                break;
            default:
                System.out.println("������ ������ �� ����������");
        }
    }

}
