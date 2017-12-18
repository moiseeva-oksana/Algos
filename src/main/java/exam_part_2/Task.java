package exam_part_2;

import chapter1.Util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Task {
    public String longestSubstring(String str1, String str2) {
        StringBuilder result = new StringBuilder();

        if (Util.isEmpty(str1) || Util.isEmpty(str2))
            return "";

        int[][] num = new int[str1.length()][str2.length()];
        int maxLen = 0;
        int lastSubsBegin = 0;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    if ((i == 0) || (j == 0))
                        num[i][j] = 1;
                    else
                        num[i][j] = 1 + num[i - 1][j - 1];

                    if (num[i][j] > maxLen) {
                        maxLen = num[i][j];
                        int thisSubsBegin = i - num[i][j] + 1;
                        if (lastSubsBegin == thisSubsBegin) {
                            result.append(str1.charAt(i));
                        } else {
                            lastSubsBegin = thisSubsBegin;
                            result = new StringBuilder();
                            result.append(str1.substring(lastSubsBegin, i + 1));
                        }
                    }
                }
            }
        }

        return result.toString();
    }

    public String longestSubstring(Set<String> set) {
        List<String> list1 = new ArrayList<>(set);
        List<String> list2 = new ArrayList<>(set);
        Set<String> substrings = new HashSet<>();
        for (Iterator<String> iterator = list1.iterator(); iterator.hasNext(); ) {
            String str1 = iterator.next();
            for (String str2 : list2) {
                if (str1 != str2) {
                    substrings.add(longestSubstring(str1, str2));
                }

            }
            iterator.remove();
        }
        Set<String> commonSubstrings = new HashSet<>();
        for (String subStr : substrings) {
            boolean flag = true;
            for (String str : set) {
                if (!str.contains(subStr)) {
                    flag = false;
                }
            }
            if (flag) {
                commonSubstrings.add(subStr);
            }
        }
        return Collections.max(commonSubstrings, Comparator.comparingInt(String::length));
    }
}
