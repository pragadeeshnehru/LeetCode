class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        List<Double> ans = new ArrayList();
        int i = 0;
        int j = k-1;
        List<Integer> temp = new ArrayList<>();
        for (int x = 0; x < k - 1; x++) {
            temp.add(nums[x]);
        }
        Collections.sort(temp);
        while(j < nums.length) {
            int num = nums[j];
            int insertIdx = Collections.binarySearch(temp, num);
            if (insertIdx < 0) {
                insertIdx = -insertIdx - 1;
            }
            temp.add(insertIdx, num);

            if (k % 2 == 1) {
                double median = (double) temp.get(k / 2);
                ans.add(median);
            } else {
                int idx = k / 2;
                double median1 = (double) temp.get(idx);
                double median2 = (double) temp.get(idx - 1);
                ans.add((median1 + median2) / 2);
            }

            int removeIdx = Collections.binarySearch(temp, nums[i]);
            if (removeIdx < 0) {
                removeIdx = -removeIdx - 1;
            }
            temp.remove(removeIdx);

            i++;
            j++;
        }

        double[] resArray = new double[ans.size()];
        for (int x = 0; x < ans.size(); x++) {
            resArray[x] = ans.get(x);
        }

        return resArray;
    }
}
