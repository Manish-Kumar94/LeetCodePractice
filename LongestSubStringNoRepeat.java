public class LongestSubStringNoRepeat {
    public static void main(String[] args) {
        String s = "aabacdabc";
        System.out.println(GetLengthOfLongestSubstring(s));
    }

    // Solution by my thought process without looking at other's solution beforehand
    private static int GetLengthOfLongestSubstring(String s) {
        Integer res = 1;
        Integer startPtr = 0;
        Integer endPtr = 1;

        while (endPtr < s.length()) {
            Integer charIndexInSubstring = s.substring(startPtr,endPtr).indexOf(s.charAt(endPtr))+startPtr;
            if(charIndexInSubstring!=-1){
                if(res < endPtr-startPtr) res = endPtr-startPtr;
                startPtr = charIndexInSubstring+1;
            }
            endPtr = endPtr+1;
            if(endPtr==s.length() 
            && startPtr<s.length()-1 
            && !s.substring(startPtr,s.length()-1).contains(""+s.charAt(endPtr-1)) 
            && res < endPtr-startPtr) res = endPtr-startPtr;
        }

        return res;
    }
}
