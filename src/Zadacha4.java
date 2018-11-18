import java.util.Scanner;

public class Zadacha4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int X = in.nextInt();
        System.out.println("Введите число:");
        int Y = in.nextInt();
        System.out.println("Введите число: ");
        int Z = in.nextInt();

        int A = (X+Y+Z)/3;

        System.out.println("Среднее арифметическое введенных чисел:" + " " + A);

        int B = A/2;

        System.out.println("Результат деления среднего арифметического на 2 без остатка:" + " " + B);

        if (B>3) {
            System.out.println("Программа выполнена корректно");
        }


    }


}
