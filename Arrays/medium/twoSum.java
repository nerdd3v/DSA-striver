package Arrays.medium;


import java.util.Arrays;

public class twoSum {
    public static int[] two(int nums[], int target){
        // Approach: only if sorting is allowed
        
        Arrays.sort(nums);

        int right = nums.length-1;
        int left = 0;
        int result[] = new int[2];
        int notFOund[] = {-1};

        while(left<=right){
            if(nums[right]+nums[left] == target){
                result[0] = left;
                result[1] = right;
                return result;
            }else if(nums[right]+nums[left] < target){
                left++;
            }else{
                right--;
            }
        }
        return notFOund;
    }
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 13;
        System.out.println(Arrays.toString(two(arr, target)));
    }
}
