package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Leetcode problems
 */
public class Leet {
    private static Map<Integer, Integer> cash = new HashMap<>();
    private static long inverseInt(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        mark:
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (j == i) continue;
                if (chars[i] == chars[j]) continue mark;
            }
            return i;
        }
        return -1;
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] charsS = s.toCharArray();
        Arrays.sort(charsS);

        char[] charsT = t.toCharArray();
        Arrays.sort(charsT);

        return Arrays.equals(charsS, charsT);

    }

    public static boolean isPalindrome(String s) {
        String lowerCase = s.toLowerCase();
        String letters = lowerCase.replaceAll("[^a-z0-9]", "");
        for (int i = 0; i < letters.length(); i++) {
            if (letters.charAt(i) != letters.charAt(letters.length() - 1 - i)) return false;
        }
        return true;
    }

    public static int strStr(String haystack, String needle) {
        if (haystack.equals(needle)) return 0;
        if (haystack.length() < needle.length()) return -1;
        if (needle.equals("")) return 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.length() - i >= needle.length()) {
                boolean contains = true;
                for (int j = 0; j < needle.length(); j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        contains = false;
                        break;
                    }
                }
                if (contains) return i;
            }
        }
        return -1;
    }


    private static List<String> permuteRec(String str) {
        if (str.length() == 0) {
            return Collections.emptyList();
        } else if (str.length() == 1) {
            return Collections.singletonList(str);
        } else if (str.length() == 2) {
            return Arrays.asList(str, new StringBuilder(str).reverse().toString());
        } else {
            List<String> result = new ArrayList<>();
            for (int i = 0; i < str.length(); i++) {
                String currentLetter = String.valueOf(str.charAt(i));
                List<String> permute = permuteRec(str.substring(0, i) + str.substring(i + 1))
                        .stream()
                        .map(currentLetter::concat)
                        .collect(Collectors.toList());
                result.addAll(permute);
            }
            return result;
        }
    }

    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (!cash.containsKey(n)) {
            int result = climbStairs(n - 1) + climbStairs(n - 2);
            cash.put(n, result);
            return result;
        } else return cash.get(n);
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = 0;
        for (int element : nums) {
            currentSum += element;
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(permuteRec("abc"));
    }
}
