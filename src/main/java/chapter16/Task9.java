package chapter16;

public class Task9 {
    public int subtract(int x, int y) {
        y = ~y;
        return x + ++y;
    }

    public int multiply(int x, int y) {
        int result = 0;
        for (int i = 0; i < y; i++) {
            result += x;
        }
        return result;
    }

    public int divide(int x, int y) {
        if (x < y) return 0;
        int result = 0;
        do {
            x = subtract(x, y);
            result++;
        }
        while (x > 1);
        return result;
    }
}
