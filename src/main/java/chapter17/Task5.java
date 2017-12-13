package chapter17;

import java.util.List;

//1h
public class Task5 {
    public List<Character> subList(List<Character> list) {
        int letters = 0;
        int digits = 0;
        for (Character character : list) {
            if (Character.isDigit(character)) {
                digits++;
            }
            if (Character.isLetter(character)) {
                letters++;
            }
        }
        if (letters == digits) {
            return list;
        }
        if (letters < digits) {
            int let = 0;
            int dig = 0;
            int i = 0;
            while (!(let == dig && let == letters)) {
                if (Character.isDigit(list.get(i))) {
                    dig++;
                }
                if (Character.isLetter(list.get(i))) {
                    let++;
                }
                i++;
            }
            return list.subList(0, let + dig);
        } else {
            int let = 0;
            int dig = 0;
            int i = 0;
            while (!(let == dig && let == digits)) {
                if (Character.isDigit(list.get(i))) {
                    dig++;
                }
                if (Character.isLetter(list.get(i))) {
                    let++;
                }
                i++;
            }
            return list.subList(0, let + dig);
        }
    }
}
