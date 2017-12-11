package chapter16;

public class Task1 {
    //15min
    public void swap(int[] arr) {
        arr[0] = arr[0]^arr[1];
        arr[1] = arr[0]^arr[1];
        arr[0] = arr[0]^arr[1];
    }
}
