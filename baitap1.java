import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arrayNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i = input.nextInt();
        System.out.println(abc(arrayNumber, i));
    }
    public static boolean abc(int[] arr, int d) {
        boolean result = false;
        for (int bien : arr
        ) {
            if (bien == d) {
                result = true;
                System.out.println("Day la so" + d);
            }
        }
        return result;
    }
}
