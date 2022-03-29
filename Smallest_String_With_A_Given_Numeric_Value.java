import java.util.*;
import java.util.Arrays;

class Smallest_String_With_A_Given_Numeric_Value {
    public String getSmallestString(int n, int k) {
        StringBuilder sb = new StringBuilder();
	int aCount = 0; //宣告'a'字母要放幾個
        if(n==1){
        	char ch = (char)(k+96); //+96為int轉成小寫英文字母
        	sb.append(String.valueOf(ch));
        	return sb.toString();
        }else{
        	int[] result = lastCharIndex(n,k,aCount,sb);
        	aCount = result[1];
        	sb.append((char)(result[0]+96));
                //放完'a'和剩下的字母，其餘放'z'
        	for(int j=0; j<n-aCount-1; j++){
        		sb.append("z");
        	}
        }
        return sb.toString();
    }

        //算出'a'能放的最大數量下，剩下的英文字母對應的ASCII位置
	public static int[] lastCharIndex(int n, int k, int aCount, StringBuilder sb){
		if((n-1)*26>k-1){
			sb.append("a");
			return lastCharIndex(n-1,k-1,aCount+1,sb);
		}
		int[] result = new int[2];
    	int lastCharIndex=0;
    	lastCharIndex = k-(n-1)*26;
    	result[0]=lastCharIndex;
    	result[1]=aCount;
    	return result;
	}
}