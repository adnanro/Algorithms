import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        int[] numbers = {72, 35, 3, 2, 1, 7, 57, 64, 135, 0};
    
        BubbleSort bubbleSort = new BubbleSort();
        int[] bubbleSorted = bubbleSort.bubbleSort(Arrays.copyOf(numbers, numbers.length));
        System.out.println("Bubble Sort: " + Arrays.toString(bubbleSorted));

        
        SelectionSort selectionSort = new SelectionSort();
        int[] selectionSorted = selectionSort.selectionSort(Arrays.copyOf(numbers, numbers.length));
        System.out.println("Selection Sort: " + Arrays.toString(selectionSorted));

        
        InsertionSort insertionSort = new InsertionSort();
        System.out.println("Insertion Sort: " + insertionSort.insertionSort(new ArrayList<>(Arrays.asList(72, 35, 3, 2, 1, 7, 57, 64, 135, 0))));
    }
}