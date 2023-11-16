package funWithArrays;

import java.util.Arrays;

public class DuplicateZeros {

    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int count = arr.length - 1;
                while (count > i) {
                    arr[count] = arr[count - 1];
                    count--;
                }
                i++;
            }
        }
    }
    public static void duplicateZeros2(int[] arr) {
         int countZeros = 0;
        int n = arr.length;
        
        for (int num : arr) {
            if (num == 0) {
                countZeros++;
            }
        }
        
        int i = n - 1;
        int j = n + countZeros - 1;
        
        while (i != j) {
            if (arr[i] == 0) {
                if (j < n) {
                    arr[j] = 0;
                }
                j--;
            }
            
            if (j < n) {
                arr[j] = arr[i];
            }
            
            i--;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        int[] arr2 = {1, 2, 3};
        duplicateZeros(arr);
        duplicateZeros(arr2);
        System.out.println(Arrays.toString(arr));
        
        System.out.println(Arrays.toString(arr2));

    }
}
