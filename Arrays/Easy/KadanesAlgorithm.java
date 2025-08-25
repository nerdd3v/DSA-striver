package Arrays.Easy;

public class KadanesAlgorithm {
    public static int kadane(int nums[]){
        int max = Integer.MIN_VALUE;
        int sum =0;
        for(int i = 0; i< nums.length; i++){
            sum+=nums[i];
            max = Math.max(max, sum);
            if(sum <0){
                sum=0;
            }else{
                continue;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[] = {-2, -3, -7, -2, -10, -4};
        System.out.println(kadane(nums));
    }
}
