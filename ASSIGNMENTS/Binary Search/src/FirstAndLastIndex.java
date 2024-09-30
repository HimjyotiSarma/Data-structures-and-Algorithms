public class FirstAndLastIndex {
    public static void main(String[] args) {

    }
    public int[] searchRange(int[] nums, int target){
        int[] ans = {-1, -1};
        ans[0] = Search(nums, target, true);
        if(ans[0] != -1){
            int right = Search(nums, target, false);
            ans[1] = right;
        }
        return ans;


    }
    private static int Search(int[] nums, int target, boolean findStartIndex){
        int start = 0;
        int answer = -1;
        int end = nums.length -1;
        while(start<= end){
            int mid = start+(end-start)/2;

            if(nums[mid] < target){
                start = mid+1;
            }else if(nums[mid] > target){
                end = mid-1;
            }else{
                answer = mid;
                if(findStartIndex){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }
        }
        return answer;
    }
}
