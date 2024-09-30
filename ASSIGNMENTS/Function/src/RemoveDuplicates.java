import java.util.Arrays;
public class RemoveDuplicates {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int[] originalNums = Arrays.copyOf(nums, nums.length);
            Arrays.fill(nums,'_');
            int currentNum = Integer.MIN_VALUE;
            int k = 0;
            for(int i = 0; i < originalNums.length; i++){
                if(currentNum != originalNums[i]){
                    currentNum = originalNums[i];
                    nums[k] = currentNum;
                    k++;
                }
                continue;
            }
            return k;
        }
    }
}
