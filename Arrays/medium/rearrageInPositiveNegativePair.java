package Arrays.medium;

import java.util.Arrays;

public class rearrageInPositiveNegativePair {
    public static void brute(int nums[]){
        int pos[] = new int[nums.length/2];
        int neg[] = new int[nums.length/2];
        int posInd = 0;
        int negInd = 0;
        int res[] = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>0){
                pos[posInd] = nums[i];
                posInd++;
            }else{
                neg[negInd] = nums[i];
                negInd++;
            }
        }
        for(int i = 0; i<nums.length/2; i++){
            res[2*i] = pos[i];
            res[2*i+1] = neg[i];
        }
        System.out.println(Arrays.toString(res));
    }
    //optimal
    public static void rearrange(int nums[]){
        int pos = 0;
        int neg = 1;
        int res [] = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>0){
                res[pos] = nums[i];
                pos+=2;
            }else{
                res[neg] = nums[i];
                neg+=2;
            }
        }
        System.out.println(Arrays.toString(res));
    }
    public static void main(String[] args) {
        int nums[] = {2, 4, 5, -1, -3, -4};
        rearrange(nums);
    }
}
