import java.util.ArrayList;
import java.util.List;

public class CandyAlternative {
    class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int lengthArr = candies.length;
            ArrayList<Boolean> result = new ArrayList<Boolean>();
            for(int i = 0 ; i < lengthArr ; i++){
                int greatest = candies[i] + extraCandies;
                boolean isGreatest = true;
                for(int j = 0; j < lengthArr ; j++){
                    if(greatest < candies[j]){
                        // result.add(false);
                        isGreatest = false;
                    }
                }
                if(isGreatest){
                    result.add(true);
                }else{
                    result.add(false);
                }

            }
            return result;

        }
    }
}
