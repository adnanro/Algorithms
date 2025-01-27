import java.util.Arrays;

public class SelectionSort {
    public int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallest = i;

            //looking for smallest number
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[smallest]) {
                    smallest = j;
                }
            }
            int temp = array[i];
            array[i] = array[smallest];
            array[smallest] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] numbers = {72, 35, 3, 2, 1, 7, 57, 64, 135, 0};
        SelectionSort sorter = new SelectionSort();
        System.out.println(Arrays.toString(sorter.selectionSort(numbers)));
    }
}