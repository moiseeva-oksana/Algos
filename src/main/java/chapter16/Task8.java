package chapter16;

//1.5h
public class Task8 {
    public String spell(int x) {
        StringBuilder result = new StringBuilder();
        int thousands = x / 1000;
        if (thousands != 0) {
            result.append(makeWord(thousands)).append(" thousands ");
        }
        int hundreds = (x - thousands * 1000) / 100;
        if (hundreds != 0) {
            result.append(makeWord(hundreds)).append(" hundreds ");
        }
        int dec = (x - thousands * 1000 - hundreds * 100) / 10;
        int left = x - (thousands * 1000 + hundreds * 100 + dec * 10);
        if (dec != 0) {
            if (dec == 1) {
                result.append(makeFirstTeens(left));
                return result.toString();
            } else {
                result.append(makeTeens(dec)).append(" ");
            }
        }
        result.append(makeWord(left));

        return result.toString();
    }

    private String makeFirstTeens(int x) {
        switch (x) {
            case 1:
                return "eleven";
            case 2:
                return "twelve";
            case 3:
                return "thirteen";
            case 4:
                return "fourteen";
            case 5:
                return "fifteen";
            case 6:
                return "sixteen";
            case 7:
                return "seventeen";
            case 8:
                return "eighteen";
            case 9:
                return "nineteen";
            default:
                return "";
        }
    }

    private String makeWord(int x) {
        switch (x) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "";
        }
    }

    private String makeTeens(int x) {
        switch (x) {
            case 1:
                return "one";
            case 2:
                return "twenty";
            case 3:
                return "thirty";
            case 4:
                return "forty";
            case 5:
                return "fifty";
            case 6:
                return "sixty";
            case 7:
                return "seventy";
            case 8:
                return "eighty";
            case 9:
                return "ninety";
            default:
                return "";
        }
    }
}
