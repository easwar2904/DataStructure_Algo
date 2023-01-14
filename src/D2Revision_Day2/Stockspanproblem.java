package D2Revision_Day2;

import java.util.Stack;

public class Stockspanproblem {
    // https://practice.geeksforgeeks.org/problems/stock-span-problem-1587115621/0
    public static int[] calculateSpan(int price[], int n)
    {
        Stack<Integer> st = new Stack<Integer>();
        //push the index(dyas) in the stack
        st.push(0);
        
        int span[] = new int[price.length];
        span[0] = 1;
        for(int i=1;i<price.length;i++){
        
            while(!st.isEmpty() && price[i]>=price[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                span[i] = i+1;
            }
            else{
                span[i] = i-st.peek();
            }
            st.push(i);
        }
        return span;
        
    }
    
}


