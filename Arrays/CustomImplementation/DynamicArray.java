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
            arrayExtender();
            // idx++;
            // arr[idx] = val;
            // return;
        }

        idx ++;
        arr[idx] = val;
    }

    public int[] arrayExtender(){
        int sizes = size*2;
        this.size = sizes;
        int data[] = new int[sizes];

        for(int i = 0; i < arr.length; i++){
            data[i] = this.arr[i];
        }

        this.arr = data;
        return this.arr;
    }

    protected boolean isFull(){
        return this.size-1 == idx;
    } 

    public void print(){
        for(int i = 0; i<= idx; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        DynamicArray a = new DynamicArray(4);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.print();
    }
}
