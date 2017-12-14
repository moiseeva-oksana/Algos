package chapter8;

public class Task5 {
    public int multiply(int x, int y) {
        if (y == 1) return x;
        return x + multiply(x, y - 1);
    }
}
