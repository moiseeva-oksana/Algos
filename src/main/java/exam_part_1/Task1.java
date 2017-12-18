package exam_part_1;

import java.util.HashMap;

public class Task1 {
    //O(n) = n
    public  boolean isFibonacci(String str, int bound) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        fibonacci(bound, hash);
        StringBuilder values = new StringBuilder();
        values.append(1);
        values.append(1);
        hash.values().forEach(values::append);
        String fib = values.toString();
        return fib.contains(str);
    }
    //O(n) = n
    private int fibonacci(int n, HashMap<Integer, Integer> memoized) {
        if (memoized.containsKey(n)) {
            return memoized.get(n);
        }
        if (n <= 0) {
            return 0;
        }
        if (n <= 2) {
            return 1;
        } else {
            int result = fibonacci(n - 1, memoized) + (fibonacci(n - 2, memoized));
            memoized.put(n, result);
            return result;
        }
    }
}
