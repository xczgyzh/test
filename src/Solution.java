
public class Solution {
    public static int longestSubstring(String A, int n) {
        if(A==null||n==0){
            return 0;
        }
        char strA[]=A.toCharArray();
        int map[]=new int[30000];
        for(int i=0;i<30000;i++){
            map[i]=-1;
        }
        int len=0;
        int pre=-1;
        int cur=0;
        for(int i=0;i<n;i++){
            pre=Math.max(pre,map[strA[i]]);
            cur=i-pre;
            len=Math.max(len,cur);
            map[strA[i]]=i;
        }
        return len;
    }

}