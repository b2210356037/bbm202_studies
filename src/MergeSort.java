import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public List<Integer> merge_sort(List<Integer> arr){
        int n = arr.size();
        if(n <= 1) return arr;
        int m = n/2;
        List<Integer> l = new ArrayList<>(arr.subList(0, m));
        List<Integer> r = new ArrayList<>(arr.subList(m, n));
        return merge(merge_sort(l), merge_sort(r));
    }

    public List<Integer> merge(List<Integer> l, List<Integer> r){
        List<Integer> c = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < l.size() && j < r.size()){
            if(l.get(i) > r.get(j)){
                c.add(r.get(j));
                j++;
            }
            else{
                c.add(l.get(i));
                i++;
            }
        }
        while(i < l.size()){
            c.add(l.get(i));
            i++;
        }
        while (j < r.size()){
            c.add(r.get(j));
            j++;
        }
        System.out.println(c);
        return c;
    }
}
