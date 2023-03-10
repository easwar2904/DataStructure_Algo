package D2Revision;

import java.util.HashMap;

public class MinimumWindowSubstring {
        public String minWindow(String s, String t) {
            if(s==null|| s.length() < t.length() || s.length() == 0) 
                return "";
    
            HashMap<Character,Integer> map = new HashMap<Character,Integer>();
            for(char c : t.toCharArray()){
                map.put(c,map.getOrDefault(c,0)+1);
            }
    
            int left = 0; int leftMost =0;
            int right =0;
            int minLen = s.length()+1;
            int count =0;
    
            for(right=0;right<s.length();right++){
                if(map.containsKey(s.charAt(right))){
                    map.put(s.charAt(right),map.get(s.charAt(right))-1);
    
                if(map.get(s.charAt(right)) >= 0) count++;
                
                while(count == t.length()){
                    if(right-left+1 < minLen){
                        leftMost = left;//taking leftMost var for track the start point of ans
                        minLen = right-left+1;
                    }
                    //slice the window
                    //remove char from start until the count!=t.len()
                    if(map.containsKey(s.charAt(left))){
                        map.put(s.charAt(left),map.get(s.charAt(left))+1);
                        if(map.get(s.charAt(left))>0) count--;
                        }
                    left++;
                    }
                }  
            }
            if(minLen>s.length())  
            {  
                return "";  
            }  
            return s.substring(leftMost,leftMost+minLen);
        }
    }