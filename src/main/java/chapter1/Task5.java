package chapter1;

import static chapter1.Util.isEmpty;


/**
 * Created by Oksana_Moiseeva on 12/5/2017.
 */
//1,5h
public class Task5 {

    boolean isCharReplaced(String str1, String str2) {
        if (isEmpty(str1) || isEmpty(str2)) return false;
        if (str1.length() != str2.length()) return false;
        int diffCount = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                diffCount++;
            }
        }
        return diffCount <= 1;
    }

    boolean isCharDeleted(String str1, String str2) {
        if (isEmpty(str1) || isEmpty(str2)) return false;
        if (str1.length() == str2.length()) return false;
        String max = str1.length() > str2.length() ? str1 : str2;
        String min = str1.length() < str2.length() ? str1 : str2;
        int diffCount = 0;
        for (int i = 0, j = 0; i < max.length(); i++, j++) {
            if (j == min.length()) break;
                if (max.charAt(i) != min.charAt(j)) {
                    i++;
                    diffCount++;
                }
        }
        return diffCount <= 1;

    }

    public boolean isOnlyOneReplacing(String str1, String str2) {
        return isCharReplaced(str1, str2) || isCharDeleted(str1, str2);
    }
}
