import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //SelectionSort selectionSort;
        //selectionSort = new SelectionSort();
        List<Integer> arr = new ArrayList<>();
        arr.add(64);
        arr.add(34);
        arr.add(25);
        arr.add(12);
        arr.add(22);
        arr.add(11);
        arr.add(90);
        //selectionSort.selection_sort(arr);

        //InsertionSort insertionSort;
        //insertionSort = new InsertionSort();
        //insertionSort.insertion_sort(arr);

//        MergeSort mergeSort;
//        mergeSort = new MergeSort();
//        mergeSort.merge_sort(arr);

        QuickSort quickSort;
        quickSort = new QuickSort();
        quickSort.quick_sort(arr, 0, arr.size()-1);
        System.out.println(arr);

    }
}