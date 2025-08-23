package Arrays.Easy;

public class checkSorted {
    public static boolean sorted(int nums[]){
        for(int i = 0; i< nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int nums[] = {3,3,6,7,3};
        System.out.print(sorted(nums));
    }
}
