package Lesson1.hw;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("Hello my friends!!!");

            printThreeWords();
            checkSumSign();
            printColor();
            compareNumbers();

        }
//2.
    public static void printThreeWords() {

        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }
//3.
    public static void checkSumSign() {
        int a = 5;
        int b = 25;
        int result = a + b;
        if (result >= 0) {
            System.out.println("Сумма положительная");}
        else {
            System.out.println("Сумма отрицательная");}

    }
    //4.
    public static void printColor() {
        int value = 1;

       // int result = value ;
        if (value <= 0) {
            System.out.println("Красный");}
        if (value > 0 && value <=100) {
            System.out.println("Желтый");}
        if (value > 100) {
            System.out.println("Зеленый");}
    }
//5.
    public static void compareNumbers() {
        int a = 5;
        int b = 25;
        if (a >= b) {
            System.out.println("a >= b");}
        else {
            System.out.println("a < b");}
}
    }


