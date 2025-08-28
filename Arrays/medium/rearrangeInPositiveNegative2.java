// package Arrays.medium;

// public class rearrangeInPositiveNegative2 {
//     public static void rearrange(int nums[]){
//         int pos[] = new int[nums.length/2];
//         int neg[] = new int[nums.length/2];
//         int posInd = 0;
//         int negInd = 0;
//         int res[] = new int[nums.length];


//         for(int i = 0; i<nums.length; i++){
//             if(nums[i]>0){
//                 pos[posInd] = nums[i];
//                 posInd++;
//             }else{
//                 neg[negInd] = nums[i];
//                 negInd++;
//             }
//         }

//         if(negInd > posInd){
//             for(int i = 0; i<=posInd; i++){
//                 res[2*i] = pos[i];
//                 res[2*i+1] = neg[i];
//             }
//             for(int i = posInd; i<= negInd; i++){
//                 res[i] = neg[i]
//             }

//         }else{
            
//         }

//         // for(int i = 0; i<nums.length/2; i++){
//         //     res[2*i] = pos[i];
//         //     res[2*i+1] = neg[i];
//         // }
//     }
//     public static void main(String[] args) {
//         int nums[] = {1,3,-4,7,9,-6};
//     }
// }
