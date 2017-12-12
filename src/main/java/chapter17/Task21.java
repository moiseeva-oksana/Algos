package chapter17;

//2h
public class Task21 {
    public int getVolume(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result + smallerNonZeroNeighbour(arr, i) - arr[i];
        }
        return result;
    }

    private int smallerNonZeroNeighbour(int[] arr, int index) {
        int maxIndex = index;
        for (int i = index + 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        int minIndex = index;
        for (int j = index - 1; j >= 0; j--) {
            if (arr[j] > arr[minIndex]) {
                minIndex = j;
            }
        }
        return Integer.min(arr[maxIndex], arr[minIndex]);
    }
}
