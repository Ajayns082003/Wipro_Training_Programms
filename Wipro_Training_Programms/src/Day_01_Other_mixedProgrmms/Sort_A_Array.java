package Day_01_Other_mixedProgrmms;

import java.util.Arrays;

public class Sort_A_Array {
    public static void main(String[] args) {
        int[] arr = {50, 20, 40, 10, 30};

        Arrays.sort(arr);

        System.out.println("Sorted array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

}
