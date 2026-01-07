package Tree.CustomImplementation;

import java.util.Stack;

public class rectangleHistogram {
    public void d(int h[]){
        Stack<Integer> s = new Stack<>();
        int ans = 0;

        for(int i = 0; i< h.length; i++){
            if(s.isEmpty()){
                s.push(h[i]);
                ans+= s.peek();
            }else{
                int curr = h[i];
                //here a while loop that will pop everything out till the ith index and get the current max combination 
                while(!s.empty() && s.peek() >= curr){
                    int contains = s.peek()*(i+1);
                    
                }
            }
        }
    }
    public static void main(String[] args) {
        int heights[] = {2,3,5,6,2,3};

    }
}
