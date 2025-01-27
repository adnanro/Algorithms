import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {
    
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList
            (72, 35, 3, 2, 1, 7, 57, 64, 135, 0));
        
    public ArrayList<Integer> insertionSort(ArrayList<Integer> array) {
        int i = 0;
        while (i < array.size()) {
            // change number position to start of array if its lesser than first number
            if (array.get(i) <= array.get(0)) { 
                array.add(0, array.remove(i));
            } else {
                // puting number to next appropriate place
                if (array.get(i) < array.get(i - 1)) {
                    int j = 1;
                    while (j < i) {
                        if (array.get(i) < array.get(j)) {
                            array.add(j, array.remove(i));
                            break;
                        }
                        j++;
                    }
                }
            }
            i++;
        }
        return array;
    }

    public static void main(String[] args) {
        InsertionSort sorter = new InsertionSort();
        System.out.println(sorter.insertionSort(sorter.numbers));
    }
}
