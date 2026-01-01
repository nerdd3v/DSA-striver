package Arrays.Easy;

import java.util.Arrays;

public class moveZeores {
    //0, 0, 3, 5, 6
    public static void moveZeroToEnd(int[] nums) {
        int z = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]!= 0){
                int temp = nums[z];
                nums[z] = nums[i];
                nums[i] = temp;
                z++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int nums[] = {0, 0, 3, 5, 6};
        moveZeroToEnd(nums); 
        
    }
}
