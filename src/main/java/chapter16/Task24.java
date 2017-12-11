package chapter16;


import java.util.ArrayList;
import java.util.List;

//1.5h
public class Task24 {
    public List<int[]> getPairs(List<Integer> list, int sum) {
        List<Integer> visited = new ArrayList<>();
        List<int[]> result = new ArrayList<>();
        ;
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (num > sum || visited.contains(i)) {
                continue;
            }
            int search = list.indexOf(sum - num);
            if (search > -1) {
                result.add(new int[]{num, sum - num});
                visited.add(list.indexOf(sum - num));
            }
        }
        return result;
    }
}
