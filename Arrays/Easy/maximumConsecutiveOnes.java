package Arrays.Easy;

public class maximumConsecutiveOnes {
    public static int maximumOnes(int nums[]){
        int cur = 0; 
        int ans = 0;

        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 1){
                cur++;
                ans = Math.max(cur, ans);
            }
            else{
                cur = 0;
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {1,  0,  1, 1,  0, 1};
        System.out.println(maximumOnes(nums));
    }
}
