public class PlusOne {
    // Approach ONE
    class Solution {
        public int[] plusOne(int[] digits) {
            long numOutput = 0;
            ArrayList<Integer> outputList = new ArrayList<Integer>();
            int carry = 0;
            int digitSize = digits.length;
            while(digitSize > 0 || carry != 0 ){
                if(digitSize <=0){
                    outputList.add(carry);
                    carry/=10;
                    continue;
                }
                int currentNum = digits[digitSize-1];
                int carrySum = 0;
                if(digitSize == digits.length){
                    carrySum = currentNum + 1;
                }else{
                    carrySum = currentNum + carry;
                }
                outputList.add(carrySum % 10);
                carry = carrySum / 10;
                digitSize--;
            }
            int[] resultArr = new int[outputList.size()];
            for(int i = 0 ; i < outputList.size() ; i++  ){
                resultArr[outputList.size()-1-i]= outputList.get(i);
                outputList.remove(outputList);
            }
            return resultArr;
        }
    }
    // END of Approach ONE



}
