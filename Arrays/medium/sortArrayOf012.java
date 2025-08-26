package Arrays.medium;

import java.util.Arrays;

public class sortArrayOf012 {
    public static void sort(int nums[]){
        int low = 0; 
        int mid = 0;
        int high = nums.length-1;

        while(mid<=high){
            if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            }else if(nums[mid] ==1){
                mid++;
            }
            else{
                int temp = nums[mid]; //storage of 2
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int num [] = {1, 0, 2, 1, 0,2};
        sort(num);
    }
}
