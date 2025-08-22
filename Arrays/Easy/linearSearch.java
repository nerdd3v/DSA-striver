package Arrays.Easy;

public class linearSearch {
    public static int linearSearchAns(int nums[], int target) {
        int ans = 0;
		for(int i = 0; i< nums.length; i++){
            if(nums[i] == target){
                ans =i;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {2,3,4,5,3};
        System.out.println(linearSearchAns(nums, 3));
    }
}
