package Arrays.medium;

public class longestSubarray {
    public static int longest(int nums[], int k){
        int left = 0, right = 0;
        int n = nums.length;
        int sum = 0;
        int maxLen = 0;
        while(right < n){
            sum += nums[right];

            while(sum>k && left<=right){
                sum -= nums[left];
                left++;
            }

            if(sum == k){
                maxLen = Math.max(maxLen, right-left+1);
            }
            right++;
        }
        if(maxLen!=0){
        return maxLen;}
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println(longest(nums, k));
    }
}
