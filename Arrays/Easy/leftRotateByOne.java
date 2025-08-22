package Arrays.Easy;

import java.util.Arrays;

public class leftRotateByOne {
    public static void rotateArrayByOne(int[] nums) {
        int num = nums[0];
        for(int i = 0; i< nums.length-1; i++){
            nums[i] = nums[i+1];
        }
        nums[nums.length-1] = num;
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        rotateArrayByOne(nums);
    }
}
