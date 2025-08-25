package Arrays.medium;

public class KadanesArray {
    public static int[] kadanes(int nums[]){
        
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int start = 0; int end = 0; int tempStart = 0;
        
        for(int i = 0; i<nums.length; i++){
            sum+= nums[i];
            if(sum > max){
                max = sum;
                start = tempStart;
                end = i;
            }

            if(sum<0){
                sum = 0;
                tempStart = i+1;
            }
        }
        int result[] = new int[end-start+1];

        for(int i = start; i<=end; i++){
            result[i-start] = nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int[] result = kadanes(nums);
        System.out.print("Maximum sum subarray: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
