package Arrays.CustomImplementation;

public class DynamicArray {
    int size ;
    int arr[];
    int idx = -1;

    private static int defaultSize = 5;

    DynamicArray(){
        this(defaultSize);
    }
    DynamicArray(int size){
        this.size = size;
        arr = new int[size];
    }

    public void add(int val){
        if(isFull()){
            //call a function to increase the size of the array
        }
        idx ++;
        arr[idx] = val;
    }

    protected boolean isFull(){
        return this.size == idx;
    } 
    public static void main(String[] args) {
        
    }
}
