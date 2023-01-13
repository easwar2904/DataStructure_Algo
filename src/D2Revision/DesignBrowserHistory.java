package D2Revision;

import java.util.Stack;

public class DesignBrowserHistory {
    Stack<String> first = new Stack<String>();
    Stack<String> second = new Stack<String>();
    public void BrowserHistory(String homepage) {
        first.push(homepage);
    }
    
    public void visit(String url) {
        first.push(url);
        second.clear();
    }
    
    public String back(int steps) {
        for(int i=0;i<steps;i++){
            if(first.size() ==1) break;
            second.push(first.pop());
        }
        return first.peek();
    }
    
    public String forward(int steps) {
        for(int i=0;i<steps;i++){
            if(second.isEmpty()) break;
            first.push(second.pop());
        }
        return first.peek();
    }
}