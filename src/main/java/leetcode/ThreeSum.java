package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> output = new HashSet<>();

        // O(N logN)
        Arrays.sort(nums);
        
        if (nums.length < 3 || nums[0] > 0 || nums[nums.length - 1] < 0) {
            return new LinkedList<>();
        }
        
        for (int i = 0; i < nums.length; i++) {
            int requiredSum = -nums[i];
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                int destSum = nums[start] + nums[end];
                if (requiredSum == destSum) {
                    List<Integer> requiredTuple = new LinkedList<>();
                    requiredTuple.add(nums[i]);
                    requiredTuple.add(nums[start]);
                    requiredTuple.add(nums[end]);
                    output.add(requiredTuple);
                    start++;
                    end--;
                } else if (requiredSum < destSum) {
                    end--;
                } else {
                    start++;
                }
            }
        }

        return output.stream().collect(Collectors.toList());
    }

    public static void main(String o[]) {
        ThreeSum threeSum = new ThreeSum();
        int[] input = { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSum.threeSum(input));
    }
}