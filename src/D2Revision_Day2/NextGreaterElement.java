package D2Revision_Day2;

import java.util.Stack;

public class NextGreaterElement {
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        Stack<Long> st = new Stack<Long>();
        long res[] = new long[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i] = -1;
                st.push(arr[i]);
            }
            else{
                res[i] = st.peek();
                st.push(arr[i]);
            }
        }
        return res;
        
    } 
}