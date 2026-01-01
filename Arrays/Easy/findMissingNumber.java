package Arrays.Easy;

public class findMissingNumber {
    public static int missing(int nums[]){
        int n = nums.length;
        int sum = n*(n+1);
        int summ= sum/2;
        int arrSum = 0;
        for(int i = 0; i< nums.length; i++){
            arrSum += nums[i];
        }
        return summ-arrSum;
    }

    public static void main(String[] args) {
        int arr[] = {0,2,3,4};
        System.out.println(missing(arr));
    }
}
