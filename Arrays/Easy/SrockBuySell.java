package Arrays.Easy;

public class SrockBuySell {
    public static int stock(int nums[]){
        int maxProfit = 0;
        int minimal = nums[0];

        for(int i = 1; i< nums.length ; i++){
            int profit = nums[i] - minimal;
            maxProfit = Math.max(maxProfit, profit);
            minimal = Math.min(minimal, nums[i]);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int nums[] = {10,7,5,8,11,9};
        System.out.println(stock(nums));
    }
}
