package task1;

import java.util.Scanner;

public class CalcLike {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = sc.nextInt();
        System.out.println("Введите второе число");
        int b = sc.nextInt();
        System.out.println("Results:");

        int result1 = a + b;
        System.out.println(result1);

        int result2 = a - b;
        System.out.println(result2);

        int result3 = a * b;
        System.out.println(result3);

        double result4 = (double) a / b;
        System.out.println(result4);

        int result5;
        if(a > b) {
            result5 = a;
            System.out.println(a+ " > " + b);
        } if(a < b) {
            result5 = b;
            System.out.println(a + " < " + result5);
        } if(a == b) {
            System.out.println(a + "==" + b);
        }
    }
}
