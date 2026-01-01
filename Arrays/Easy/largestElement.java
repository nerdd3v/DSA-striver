package Arrays.Easy;

public class largestElement {
    public static int largest(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[] = {3,3,6,1};
        System.out.print(largest(nums));
    }
}
