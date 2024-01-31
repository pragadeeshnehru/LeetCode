class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int arr[] = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            int d = 0;
            if (i > 0 && temperatures[i] == temperatures[i - 1]) {
                arr[i] = arr[i - 1] - 1;
                if (arr[i] == -1)
                    arr[i] = 0;
                continue;
            }
            for (int j = i; j < temperatures.length; j++) {
                if (temperatures[i] >= temperatures[j])
                    d++;
                else {
                    arr[i] = d;
                    break;
                }
            }
        }
        return arr;
    }
}
