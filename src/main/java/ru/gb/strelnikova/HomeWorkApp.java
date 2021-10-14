package ru.gb.strelnikova;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords("Orange", "Banana", "Apple");
        checkSumSign ();
        printColor();
        compareNumbers ();
    }

    public static void printThreeWords(String str1, String str2, String str3) {
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }

    public static void checkSumSign() {
        int a = 5;
        int b = -6;
        if ( a+b >= 0)  {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if ((value > 0) && (value <= 100)) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 5;
        int b = 7;
        if ( a >= b )  {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
}
