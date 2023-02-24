import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 56, 74, 24, 97, 93, 65, 28};
        checkdaonguoc(array);
    }

    private static void checkdaonguoc(int[] array) {
            for (int i = 0, j = array.length - 1; i < j; i++, j--) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            System.out.println("phần tử đảo ngược "+array);
        }
        }

