package leetcode.Top100Liked;

import org.junit.Assert;

class MaxSubArray {
    private int maxSubArray(int[] nums) {
        // input is containing atleast one number
        if (nums.length == 1) {
            return nums[0];
        }
        int maxSoFar = nums[0];
        int tempMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            tempMax = (tempMax < 0) ? nums[i] : tempMax + nums[i];
            maxSoFar = Math.max(tempMax, maxSoFar);
        }

        return maxSoFar;
    }

    public static void main(String str[]) {
        MaxSubArray maxSubArray = new MaxSubArray();

        int[] input1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Assert.assertEquals(6, maxSubArray.maxSubArray(input1));
        int[] input2 = {-2, 1};
        Assert.assertEquals(1, maxSubArray.maxSubArray(input2));
        int[] input3 = {-2};
        Assert.assertEquals(-2, maxSubArray.maxSubArray(input3));
        int[] input4 = {2, 4};
        Assert.assertEquals(6, maxSubArray.maxSubArray(input4));
        int[] input5 = {2, -3, 7};
        Assert.assertEquals(7, maxSubArray.maxSubArray(input5));
        int[] input6 = {-2, -1};
        Assert.assertEquals(-1, maxSubArray.maxSubArray(input6));
    }
}