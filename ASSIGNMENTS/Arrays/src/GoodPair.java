
class GoodPair {
    public int numIdenticalPairs(int[] nums) {
        int goodPair = 0;
        for(int i = 0; i< nums.length ; i++){
            int currentNum = nums[i];
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    goodPair++;
                }

            }
        }
        return goodPair;
    }
}