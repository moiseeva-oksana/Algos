package chapter16;

import java.util.List;

public class Task17 {
    public Result maxSubSum(List<Integer> list) {
        int biggerSum = list.get(0);
        int currentSum = 0;
        int lastIndex = 0;
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            currentSum += integer;
            if (currentSum > biggerSum) {
                biggerSum = currentSum;
                lastIndex = i;
                count++;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        Result result = new Result();
        result.maxSum = biggerSum;
        result.maxSubList = list.subList(lastIndex - count, lastIndex + 1);
        return result;
    }

    public static class Result {
        private int maxSum;
        private List<Integer> maxSubList;

        public int getMaxSum() {
            return maxSum;
        }

        public List<Integer> getMaxSubList() {
            return maxSubList;
        }
    }
}
