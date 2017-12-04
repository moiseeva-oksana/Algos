package chapter1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Oksana_Moiseeva on 12/4/2017.
 */
//30 minutes
public class Task4 {
    public boolean isItReplacedPalindrome(String str) {
        Map<Character, Integer> map = new HashMap<>();
        final char[] chars = str.toCharArray();
        for (char ch : chars) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else map.put(ch, map.get(ch) + 1);
        }
        final long evenCounts = map.values().
                stream().
                filter(t -> t % 2 == 0).
                count();
        final int size = map.size();
        return evenCounts == size || evenCounts + 1 == size;

    }
}
