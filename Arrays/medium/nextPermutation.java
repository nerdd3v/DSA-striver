package Arrays.medium;

import java.util.Arrays;

public class nextPermutation {
    public static void next(int nums[]){
        int ind = -1;
        int n = nums.length;
        int indexToBeSwapped = -1;


        for(int i = n-2 ; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                ind = i;
                break;
            }
        }

        if(ind == -1){
            int start = 0;
            int end = n-1;
            while(start <= end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
            
        }else{
        

        for(int i = n-1; i>=ind; i--){
            if(nums[i]> nums[ind]){
                indexToBeSwapped = i;
                int temp = nums[indexToBeSwapped];
                nums[indexToBeSwapped] = nums[ind];
                nums[ind] = temp;
                break;
            }
        }

        int ps = ind+1;
        int pe = n-1;
        while(ps<=pe){
            int temp = nums[ps];
            nums[ps] = nums[pe];
            nums[pe] = temp;
            pe--;
            ps++;
        }
    }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int nums[] = {2, 3, 5, 4, 1, 0, 0};
        // int nums2[] = {3,2,1,0};
        next(nums);
    }
}
