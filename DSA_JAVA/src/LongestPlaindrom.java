class Solution {
    public String longestPalindrome(String s) {
        
        boolean[][] dp = new boolean[s.length()][s.length()];
        int x = 0;
        int y = 0;
        for(int diag = 0; diag < s.length(); diag++){
            int sp = 0;
            int ep = diag;
            while(ep < s.length()){
                if(diag == 0){
                    dp[sp][ep] = true;
                }else if(diag == 1){
                    if(s.charAt(sp) == s.charAt(ep))
                        dp[sp][ep] = true;
                }else{
                    if(s.charAt(sp) == s.charAt(ep) && dp[sp+1][ep-1])
                        dp[sp][ep] = true;
                }
                
                if(dp[sp][ep]){
                x = sp;
                y = ep;
                }
                
                sp++;
                ep++;
            }
            
        }
    return s.substring(x,y+1);
    }
    
}