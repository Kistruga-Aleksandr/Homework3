import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
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
        int delivery = 1;
         if (deliveryDistance > 60) {
             delivery++;
         }
          if ( deliveryDistance <= 100) {
             delivery++;
        }
        System.out.println("�������� ������ " + delivery + " ���");
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

    static public void task6() {
        int age = 19;
        int salary = 58000;
        int requiredAge = 23;
        int limitMax = 3;
        int limitMin = 2;
        double ratioMax = 1.5;
        double ratioMin = 1.2;
        int salaryMax = 80000;
        int salaryMin = 50000;
        double creditLimit = 0;

        if (age >= requiredAge && salary >= salaryMin && salary < salaryMax) {
            creditLimit = (salary * limitMax) * ratioMin;
        } else if (age < requiredAge && salary >= salaryMin && salary < salaryMax) {
            creditLimit = (salary * limitMin) * ratioMin;
        } else if (age >= requiredAge && salary >= salaryMax) {
            creditLimit = (salary * limitMax) * ratioMax;
        } else if (age < requiredAge && salary >= salaryMax) {
            creditLimit = (salary * limitMin) * ratioMax;
        } else {
            System.out.println("�� ��������� �� ����������");
        }
        System.out.println("�� ������ ������ ��� ��������� ����� � ������� " + creditLimit + " ������");

    }
    static public void task7(){
        int age = 25;
        int salary = 60000;
        int wantedSum = 330000;
        int loanTerm = 12;
        double baseRate = 1.1;
        double monthlyPaymentMax = salary * 0.5;
        int age1 = 23;
        int age2 = 30;
        double bidIncreaseMax = 0.01;
        double bidIncreaseMin = 0.005;
        double rateDrop = 0.007;
        int salaryMax = 80000;
        double monthlyPayment;
        if(age < age1 && salary >= salaryMax){
           baseRate= baseRate + bidIncreaseMax - rateDrop;
        } else if (age < age1) {
            baseRate = baseRate + bidIncreaseMax;
        } else if (age < age2 && salary >= salaryMax) {
            baseRate = baseRate + bidIncreaseMin - rateDrop;
        } else if (age < age2) {
            baseRate = baseRate + bidIncreaseMin;
        }
        monthlyPayment = (wantedSum * baseRate) / loanTerm;
        if (monthlyPayment > monthlyPaymentMax){
            System.out.println("������������ ������ ��� �� " + salary +
                    " ����� " + monthlyPaymentMax + " ������. ������ �� ������� " + monthlyPayment +" ������. ��������.");
        } else if (monthlyPayment <= monthlyPaymentMax) {
            System.out.println("������������ ������ ��� �� " + salary +
                    " ����� " + monthlyPaymentMax + " ������. ������ �� ������� " + monthlyPayment +" ������. �������.");
        }
    }

}
