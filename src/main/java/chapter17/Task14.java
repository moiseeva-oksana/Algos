package chapter17;

public class Task14 {
    public int[] kMin(int[] list, int k) {
        int[] result = new int[k];
        if (k > list.length) return new int[0];
        int[] visited = new int[list.length];
        for (int i = 0; i < k; i++) {
            int temp = Integer.MAX_VALUE;
            int index = 0;
            for (int j = 0; j < list.length; j++) {
                if (visited[j] == 1) {
                    continue;
                }
                int element = list[j];
                if (element < temp) {
                    temp = element;
                    index = j;
                }
            }
            visited[index] = 1;
            result[i] = temp;
        }
        return result;
    }
}
