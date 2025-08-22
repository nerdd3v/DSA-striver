package Arrays.medium;
import java.util.Arrays;

public class UnionOf2Arr {
    public static int[] union(int arr1[], int arr2[]){
        int m = arr1.length;
        int n = arr2.length;

       
        
        
        int result[] = new int[m+n];
        int leftMin = 0; //for handling arr1
        int rightMin = 0; //for handling arr2
        int k = 0;

        while(leftMin < m && rightMin<n){
            if(leftMin> 0 && arr1[leftMin] == arr1[leftMin-1]){
                leftMin++;
                continue;
            }
            if(rightMin>0 && arr2[rightMin] == arr2[rightMin-1]){
                rightMin++;
                continue;
            }

            if(arr1[leftMin] < arr2[rightMin]){
                result[k] = arr1[leftMin];
                leftMin++;
            }
            else if(arr1[leftMin]> arr2[rightMin]){
                result[k] = arr2[rightMin];
                rightMin++;
            }else{
                result[k] = arr1[rightMin];
                rightMin++;
                leftMin++;
            }
            k++;
        }

        while(leftMin<m){
            result[k] = arr1[leftMin];
            leftMin++;
            k++;
        }
        while(rightMin<n){
            result[k] = arr2[rightMin];
            rightMin++;
            k++;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {1, 2, 7};
        System.out.println(Arrays.toString(union(arr1, arr2)));
    }
}
