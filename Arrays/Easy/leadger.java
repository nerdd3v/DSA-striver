package Arrays.Easy;

import java.util.Arrays;

public class leadger {
    public static void ledge(int nums[]){
        int n = nums.length;
        int result[] = new int[3];
        result[0] = nums[n-1];
        int p = 1;
        int max = nums[n-1];

        for(int i = n-2; i>=1; i--){
            if(nums[i]>max){
                max = nums[i];
                result[p] = max;
                p++;
            }else{
                continue;
            }
        }
        System.out.println(Arrays.toString(result));
    }
    public static void main(String[] args) {
        int nums [] = {1, 2, 5, 3, 1, 2};
        ledge(nums);
    }
}
