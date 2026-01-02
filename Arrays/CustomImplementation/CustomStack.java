package Arrays.CustomImplementation;

public class CustomStack {
    int arr[];
    int size;
    static int defaultLength;
    int ptr = 0;

    CustomStack(){
        this.size = defaultLength;
        arr = new int[size];
    }

    CustomStack(int size){
        this.size = size;
        arr = new int[size];
    }

    public void remove()throws Exception{
        if(ptr == 0){
            throw new Exception("the stack is already empty");
        }
        ptr--;
    }

    public void insert(int val)throws Exception{
        if(ptr == size){
            throw new Exception("overflow ");
        }
        arr[ptr] = val;
        ptr++;
    }

    public int peek(){
        return arr[ptr];
    }

    public void print(){
        for(int i = 0; i< ptr; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) throws Exception {
        CustomStack s = new CustomStack(4);
        s.insert(1);
        s.insert(2);
        s.insert(3);
        s.insert(4);
        s.print();
        s.remove();
        System.out.println();
        s.print();
        s.remove();
        System.out.println();
        s.print();
    }
}
