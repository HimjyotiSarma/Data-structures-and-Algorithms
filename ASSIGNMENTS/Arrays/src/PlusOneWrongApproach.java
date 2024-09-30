public class PlusOneWrongApproach {
    // DONT USE THIS APPROACH. THIS FAILS IN BIG NUMBERS
    // CHECK PlusOne Solution

    class Solution {
        public int[] plusOne(int[] digits) {
            long numOutput = 0;
            for(int i = 0 ; i < digits.length ; i++ ){
                numOutput += digits[digits.length - 1 - i] * Math.pow(10, i);
            }
            numOutput+=1;
            int resultNumLength = String.valueOf(numOutput).length();
            int[] outputArr= new int[resultNumLength];
            int index = resultNumLength - 1;
            while(numOutput != 0){
                int current = (int) numOutput % 10;
                outputArr[index]= current;
                numOutput = numOutput / 10;
                index--;
            }
            return outputArr;
        }
    }
}
