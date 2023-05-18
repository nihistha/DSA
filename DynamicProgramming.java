public class DynamicProgramming {
    // finding the highest common prefex in two strings
    public int LCS(String S1,String S2){
        int dp[][] = new int [S2.length()+1][S1.length()+1];//S2 == i , row S1 == j , column
        for(int i = 1;i<=S2.length();i++){
            for(int j = 1;j<=S1.length();j++){
                if (S2.charAt(i-1)==S1.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1; 
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
    public static void main(String[] args) {
        DynamicProgramming d = new DynamicProgramming();
        String s1 = "abeegkoi";
        String s2 = "kdaabgdf";
        System.out.println(d.LCS(s1,s2)); 
    }
}
