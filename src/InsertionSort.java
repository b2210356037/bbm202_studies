import java.util.List;

public class InsertionSort {
    public void insertion_sort(List<Integer> arr){
        int n = arr.size();
        for(int i = 1; i < n; i++){
            int key = arr.get(i);
            int prev = i-1;
            while(prev >= 0 && arr.get(prev) > key){
                arr.set(prev+1, arr.get(prev));
                prev--;
            }
            arr.set(prev+1, key);
        }
        System.out.println(arr);
    }
}
