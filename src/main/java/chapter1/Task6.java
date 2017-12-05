package chapter1;

/**
 * Created by Oksana_Moiseeva on 12/5/2017.
 */
//1.5h
public class Task6 {
    public String reduce(String str) {
        StringBuilder result = new StringBuilder();
        char current = str.charAt(0);
        int count = 1;
        for (int i=1; i<str.length(); i++) {
            if(str.charAt(i)!=current) {
                result.append(current);
                if(count > 1) {
                    result.append(count);
                    count =1;
                }
                current = str.charAt(i);
            }
            else {
                count++;
            }
            if(i==str.length()-1) {
                result.append(current);
                if(count>1) result.append(count);
            }

        }
        final String reduced = result.toString();
        return reduced.length() < str.length() ? reduced : str;
    }

}
