package Exam_part_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Task2 {

    public static void main(String[] args) {
        System.out.println(new Task2().allPairs());
    }

    public List<Pair> allPairs() {
        List<Pair> result = new ArrayList<>();
        Set<Integer> permutations = new TreeSet<>();
        permutations("","12345678", permutations);
        System.out.println(permutations.size());
        ArrayList<Integer> list = new ArrayList<>(permutations);
        for (int divider: list) {
            for (int element : list) {
                if(element!=divider && element%divider == 0) {
                    result.add(new Pair(divider, element));
                }
            }
        }
        return result;
    }

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
