package chapter8;

import java.util.HashSet;
import java.util.Set;

//2h
public class Task7 {
    private Set<String> permutations = new HashSet<>();

    public  Set<String> permutations(String prefix, String str) {
         if(str.length() == 0) {
             permutations.add(prefix);
        }
        else {
            for (int i = 0; i < str.length(); i++)
                permutations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, str.length()));
        }
        return permutations;
    }
}
