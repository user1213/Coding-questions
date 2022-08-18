package coding;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     *
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     *Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     */

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; ++i){
            map.put(nums[i], i);
        }

        for(int i = 0; i<nums.length; ++i){
            int complement = target - nums[i];
            if(map.containsKey(complement) && i != map.get(complement)){
                return new int[]{i, map.get(complement)};
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args){
        int[] input = {2, 7, 11, 15};
        int target = 9;
        int[] output = twoSum(input, 9);
        for(int x: output){
            System.out.println(x);
        }
    }
}
