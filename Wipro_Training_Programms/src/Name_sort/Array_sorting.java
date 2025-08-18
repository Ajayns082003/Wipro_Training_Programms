package Name_sort;

interface Sorting {
 void sort(int[] array);
}

abstract class Sorter implements Sorting {
 void printArray(int[] array) {
     for (int num : array) {
         System.out.print(num + " ");
     }
     System.out.println();
 }
}


class Sort extends Sorter {
 public void sort(int[] array) {
     for (int i = 0; i < array.length - 1; i++) {
         for (int j = 0; j < array.length - i - 1; j++) {
             if (array[j] > array[j + 1]) {
           
                 int temp = array[j];
                 array[j] = array[j + 1];
                 array[j + 1] = temp;
          }
      }
     }
 }
}


public class Array_sorting {
 public static void main(String[] args) {
     int[] arr = {5, 2, 8, 1, 3};

     Sort s = new Sort();
     System.out.print("Original: ");
     s.printArray(arr);

     s.sort(arr);

     System.out.print("Sorted:   ");
     s.printArray(arr);
 }
}

