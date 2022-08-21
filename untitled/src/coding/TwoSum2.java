package coding;

import java.util.Arrays;

public class TwoSum2 {

    /**
     *
     * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number.
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public static int[] twoSum2(int[] arr, int target){
        Arrays.sort(arr);
        int low = 0, high = arr.length-1;
        while(low < high){
            int sum = arr[low] + arr[high];
            if(sum < target){
                ++low;
            }
            else if(sum > target){
                --high;
            }
            else{
                return new int[]{low+1, high+1};
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args){
        int[] input = {2,7,11,15};
        int[] output = twoSum2(input, 9);
        for(int x: output){
            System.out.println(x);
        }
    }
}

