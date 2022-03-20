import java.util.*;
import java.util.Arrays;

class No_Pairs_Allowed {
    public static void main(String[] args) {
        String[] words = {"add", "boook", "break"};

        int[] result = noPairsAllowed(words);
		System.out.println(Arrays.toString(result));
		
		
    }

    public static int[] noPairsAllowed(String[] words){
        int[] result = new int[words.length];
        for(int i=0 ;i<words.length ;i++){
            result[i] = findAdjacentEquals(words[i]);
        }

        return result;
    }

    public static int findAdjacentEquals(String word){
        int count = 0;
        char[] cArray = word.toCharArray();
        for(int i=1; i<=cArray.length; i++){
            if(i != cArray.length){
                if(cArray[i-1] == cArray[i]){
                    count = count+1;
                    ++i;
                }
            }
        }
        return count;
    }
}