package Arrays.Easy;

public class MajorityElement1 {
    public static int majority(int nums[]){
        int n = nums.length;
        int el = 0;
        int count = 0;

        for(int i = 0; i< nums.length; i++){
            if(count == 0){
                el = nums[i];
                count++;
            }
            else if(nums[i] == el){
                count++;
            }else{
                count--;
            }
        }
        count = 0;
        for(int i = 0; i< n; i++){
            if(nums[i] == el) count++;
        }
        if(count>n/2) return el;
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        int r = majority(nums);
        System.out.println(r);
    }
}
