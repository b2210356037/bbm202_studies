import java.util.List;

public class SelectionSort {
    public void selection_sort(List<Integer> arr){
        int n = arr.size();
        for(int i = 0; i < n; i++){
            int min_index = i;
            for(int j = i+1; j < n; j++){
                if(j >= 0 && arr.get(j) < arr.get(min_index)){
                    min_index = j;
                }
            }
            int temp = arr.get(min_index);
            arr.set(min_index, arr.get(i));
            arr.set(i, temp);
        }
        System.out.println(arr);
    }
}
