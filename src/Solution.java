
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
    public static void main(String args[]){
        String s="abcdea";
        String s1="abc";
        String s2="";
        String s3="abdefsfga";
        String s4="acssspdifudt";
        
        System.out.println(longestSubstring(s,s.length()));
        System.out.println(longestSubstring(s1,s1.length()));
        System.out.println(longestSubstring(s2,s2.length()));
        System.out.println(longestSubstring(s3,s3.length()));
        System.out.println(longestSubstring(s4,s4.length()));
    }
}