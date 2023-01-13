package jan12;

import java.util.HashMap;
import java.util.Map;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
    int n = nums.length;
        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            hm.put(nums[i],nums[i]);
        }
        int i;
        for(i=1;i<=n;i++){
            if(!hm.containsKey(i)) return i;
        }
        return i;
    }
}

