package chapter1;

import java.util.Arrays;

/**
 * Created by Oksana_Moiseeva on 12/4/2017.
 */
//10 minutes
class Task2 {
    boolean isReplaced(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }
        if(str1.length()!=str2.length()) {
            return false;
        }
        final char[] chars1 = str1.toCharArray();
        final char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);

    }
}
