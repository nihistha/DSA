public class GreedyAlgos{
    public static void smallestNoOfCoins(int coins[],int n){
        int[] sol = new int[5];
        int largest = 0;
        while(n>=0){
            if()
            for(int i = 0;i<coins.length;i++){
                if(coins[i]>largest){
                    largest = coins[i];
                }
            }
            n = n-largest;
            System.out.println(largest);
        }
    }
    public static void main(String[] args) {
        int c[]= {5,3,1};
        smallestNoOfCoins(c, 18);
    }
}