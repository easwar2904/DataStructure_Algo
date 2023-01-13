package jan12;

import java.util.HashSet;
import java.util.Set;

public class SplitaStringIntotheMaxNumberofUniqueSubstrings {
    public int maxUniqueSplit(String s) {
        return helper(s,new HashSet<String>());
        //naresh gupta solution(youtube)
    }
     private int helper(String s,Set<String> seen){
        int max = 0;
        for(int i=1;i<=s.length();i++){
            String candidate = s.substring(0,i);
            if(!seen.contains(candidate)){
                seen.add(candidate);
                max = Math.max(max,1+ helper(s.substring(i),seen));
                seen.remove(candidate);
            }
        }
        return max;
    }
}