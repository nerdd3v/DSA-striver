package Arrays.Easy;

public class secondLargest {
    public static int secondlargest(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]>max){
                secondMax = max;
                max = nums[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        int nums[] = {3,3,5,6,1};
        System.out.print(secondlargest(nums));
    }
}
