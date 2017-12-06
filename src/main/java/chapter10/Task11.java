package chapter10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task11 {
    public List<Integer> peeksAndPits(List<Integer> list) {
        Collections.sort(list);//should we implement sorting in this task or it's ok to use build-in algorithm?
        List<Integer> start = list.subList(0, list.size() / 2);
        List<Integer> end = list.subList(list.size() / 2, list.size());
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < (int) Math.ceil((double)(list.size())/2); i++) {
            if (end.size() > i) {
                result.add(end.get(end.size()-1-i));
            }
            if (start.size() > i)
                result.add(start.get(i));
        }
        return result;

    }
}
