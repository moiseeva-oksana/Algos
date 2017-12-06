package chapter10;

import java.util.Collections;
import java.util.List;

//30min
public class Task3 {
    public int search(List<Integer> list, int element) {
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == element) return i;
            if(list.get(i) > list.get(i+1)) {
                index = i+1;
                break;
            }
        }
        List<Integer> subList = list.subList(index, list.size());
        return Collections.binarySearch(subList, element) + index;
    }
}
