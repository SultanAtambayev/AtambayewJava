package task3;

public class ArrayA {
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int b = 0; b <= a.length - 1; b++) {
            if (a[b] % 2 == 0) {
                System.out.println(a[b]);
            }
        }
    }
}
