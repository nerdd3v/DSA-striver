package Arrays.Easy;

import java.util.Arrays;

public class leftRotateByD {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        if (k == 0) return;
        reverse(0, n-1, nums);      // Reverse whole array
        reverse(0, k-1, nums);      // Reverse first k elements
        reverse(k, n-1, nums);      // Reverse remaining n-k elements
    }
public static void reverse(int start, int end, int[] nums){
    while(start < end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
}
    public static void main(String[] args) {
        int numsp[] = {1,2,3,4,5,6,7};
        int k = 2;
        rotate(numsp, k);
    }
}
