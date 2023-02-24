public class baitap3 {public static void gtrinhonhat (int[] arr) {
    int min  = arr[0];
    for (int i = 0; i < arr.length ; i++ ) {
        if(min > arr[i]) {
            min = arr[i];
        }
    }
    System.out.println("giá trị nhỏ nhất trong mảng là : " + min);

    }
}
