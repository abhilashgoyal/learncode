package leetcode.facebook;

class LongestContinuousSubSeq {

    public int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int maxSub = 1;
        int localMaxSub = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) {
                localMaxSub++;
            } else {
                localMaxSub = 1;
            }
            maxSub = Math.max(maxSub, localMaxSub);
        }
        return maxSub;
    }

    public static void main(String args[]) {
        LongestContinuousSubSeq ob = new LongestContinuousSubSeq();
        int[] input1 = {1,3,5,4,7};
        int[] input2 = {2,2,2,2,2};
        int[] input3 = {1,3,5,4,2,3,4,5,6};
        //System.out.println(ob.findLengthOfLCIS(input1));
        //System.out.println(ob.findLengthOfLCIS(input2));
        System.out.println(ob.findLengthOfLCIS(input3));
    }
}