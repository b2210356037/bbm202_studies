import java.util.List;

public class QuickSort {
    public List<Integer> quick_sort(List<Integer> arr, int p, int r){
        int q;
        if(p < r){
            q = partition(arr, p, r);
            quick_sort(arr, p, q-1);
            quick_sort(arr, q+1, r);
        }
        return arr;
    }

    public static int partition(List<Integer> arr, int p, int r){
        int tmp;
        int x = arr.get(r);
        int i = p-1;

        for (int j = p; j <= r-1; j++){
            if(arr.get(j) <= x){
                i++;
                tmp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, tmp);
            }
        }
        tmp = arr.get(i+1);
        arr.set(i+1, arr.get(r));
        arr.set(r, tmp);
        return i+1;
    }

}


