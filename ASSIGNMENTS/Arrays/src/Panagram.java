public class Panagram {
//    APPROCH 1 with 4ms run time
    class Solution {
        public boolean checkIfPangram(String sentence) {
            int[] count = new int[26];
            for(int i = 0; i<sentence.length(); i++)
                count[sentence.charAt(i) - 'a']++;

            for(int i : count)
                if(i < 1)
                    return false;

            return true;
        }
    }

//    APPROACH 2 of ASCII code;

    class Solution2 {
        public boolean checkIfPangram(String sentence) {
            int[] countAlphabet = new int[26];

            for(int i = 0; i < sentence.length(); i++){
                int currentLetterASCII = (int) sentence.charAt(i);
                int currentLetterIndex= currentLetterASCII -'a';
                if(currentLetterASCII>=65 && currentLetterASCII<=90){
                    currentLetterIndex+=32;
                }
                countAlphabet[currentLetterIndex]++;
            }

            for(int i: countAlphabet){
                if(i < 1){
                    return false;
                }
            }
            return true;
        }
    }
    }

