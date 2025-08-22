package Arrays.Easy;

public class checkSorted {
    public static boolean sorted(int nums[]){
        boolean result=true;
        for(int i = 1; i < nums.length; i++){
            if(nums[i]<nums[i-1]){
                result = false;
                break;
            }else{
                result = true;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[] = {3,3,6,7};
        System.out.print(sorted(nums));
    }
}
