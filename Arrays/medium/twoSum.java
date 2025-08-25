package Arrays.medium;

import java.util.Arrays;

public class twoSum {
    public static int[] two(int nums[], int target){
        int result[] = new int[2];
        for(int i = 0; i< nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 17;
        System.out.println(Arrays.toString(two(arr, target)));
    }
}
