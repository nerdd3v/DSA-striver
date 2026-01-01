package Arrays.Easy;

public class elementAppearsOnce {
    public static int appears(int nums[]){
        int xor = 0;
        for(int i = 0; i < nums.length; i++){
            xor = xor ^ nums[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,2,3,3,4,4};
        appears(nums);
    }
}
