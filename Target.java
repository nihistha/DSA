public class Target {
    public static int coin(int n){
        if(n==1){
            return 1;
        }
        else if(n == 2){
            return 2;
        }
        else if(n == 3){
            return 3;
        }
        return coin(n-1) +coin (n-2) + coin(n-3);
    }

    public int combination(int arr[],int n){
        int dp[][] =new int [arr.length+1][n+1];
        for(int i =0;i<arr.length+1;i++){
            dp[i][0] = 1;
        }
        for(int i= 1;i<arr.length+1;i++){
            for(int j = 1;j<n+1;j++){
                if(arr[i-1]>j){
                    dp[i][j] = dp[i-1][j];
                }else if(arr[i-1]<=j){
                    int diff = j-arr[i-1];
                    dp[i][j] = dp[i-1][j] + dp[i][diff];
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }

    //find minimum no of coins required to make a targeted value
    //grid traveller problem
    
    //target = 6
    //minimum = 3+3
    

    public static void main(String[] args) {
        System.out.println(coin(6)); 
    }
}
