import java.util.Arrays;

public class BubbleSort {
    public int[] bubbleSort(int[] array) {
        int n = array.length;
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < n - 1) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                j++;
        }
            i++;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] numbers = {72, 35, 3, 2, 1, 7, 57, 64, 135, 0};
        BubbleSort sorter = new BubbleSort();
        System.out.println(Arrays.toString(sorter.bubbleSort(numbers)));
    }
}
