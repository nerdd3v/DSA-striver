package Arrays.CustomImplementation;

public class CustomQueue {
    int arr[];
    int front = -1;
    int last = -1;
    int size ;

    CustomQueue(int val){
        this.size = val;
        arr = new int[size];
    }

    public void enqueue(int val) throws Exception{
        if(front == -1){
            front++;
            last++;
            arr[front] = val;
            return;
        }

        if(last-1 == size){
            throw new Exception("overflow");
        }
 
        
        last++;
        arr[last] = val;
    }

    public void print(){
        for(int i = 0; i<= last; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        CustomQueue q = new CustomQueue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);

        q.print();
    }
}
