import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] resultIndex = new int[2];
            for(int i = 0 ; i < nums.length - 1 ; i++){
                for(int j = i + 1; j< nums.length ; j++ ){
                    if(nums[i] + nums[j] == target){
                        resultIndex[0] = i;
                        resultIndex[1] = j;
                        return resultIndex;
                    }
                }
            }
            return resultIndex;
        }
    }
}


// Approach two
class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> resultMap = new HashMap<>();
        int[] resultIndex = new int[2];
        for(int i = 0; i < nums.length; i++){
            int diff  = target - nums[i];
            if(resultMap.containsKey(diff)){
                resultIndex[0] = resultMap.get(diff);
                resultIndex[1] = i;
                return resultIndex;
            }else{
                resultMap.put(nums[i], i);
            }
        }
        return resultIndex;

    }
}