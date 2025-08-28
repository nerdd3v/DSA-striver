package Arrays.Easy;

public class removeDuplicates {
    public static int removeDuplicatess(int[] nums) {
        int i = 0;
        int j =1;

        while(j<nums.length){
            if(nums[i] != nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
            j++;
        }
        return i+1;
    }

    public static void main(String[] args) {
        int nums[] = {1,1,2,2,2,3,3,3};
        System.out.println(removeDuplicatess(nums));
    }
}
