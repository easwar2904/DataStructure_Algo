package D2Revision_Day2;

import java.util.HashMap;

public class KdiffPairsinanArray {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int count = 0;
        for(int key:hm.keySet()){
            if(k==0){
                if(hm.get(key)>1){
                    count++;
                }
            }
            else
            if(hm.containsKey(key-k)){
                count++;
            }
        }
        return count;
    }
}