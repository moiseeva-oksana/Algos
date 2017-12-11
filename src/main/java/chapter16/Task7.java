package chapter16;

//1h
public class Task7 {
    public int max(int x, int y) {
        int c = x - y;
        int shift = c >> 31;
        int k = shift & 0x1;
        return x - k * c;
    }
}
