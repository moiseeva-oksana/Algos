package Exam_part_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//sum O(n) = n!
public class Task2 {

    public static void main(String[] args) {
        System.out.println(new Task2().allPairs());
    }

    //0(n) ~ n
    public List<Pair> allPairs() {
        List<Pair> result = new ArrayList<>();
        Set<Integer> permutations = new TreeSet<>();
        permutations("","123456789", permutations);
        for (Integer element : permutations) {
            for (int i = 2; i < 10 ; i++) {
                int res = element * i;
                if(permutations.contains(res)) {
                    result.add(new Pair(element, res));
                }
            }
        }
        return result;
    }
    //O(n) = n!
    private Set<Integer> permutations(String prefix, String str, Set<Integer> result) {
        if(str.length() == 0) {
            result.add(Integer.valueOf(prefix));
        }
        else {
            for (int i = 0; i < str.length(); i++)
                permutations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, str.length()), result);
        }
        return result;
    }

    public static class Pair {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return "[first: " + first + ", second: " + second + "]";
        }
    }
}
