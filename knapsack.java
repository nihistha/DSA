public class knapsack {
    public static void knap(int weight[],int cost[],int capacity){
        int c = capacity;
        // int frac[] = new int[weight.length];
        int profit = 0;
        for(int i = 0;i<weight.length;i++){
            int wi= weight[i]; //4
            int ci = cost[i]; //10
            // int diff = cost[i]/weight[i];
            if(c-wi>=0){ //true
                profit = profit + ci; // profit = 10
                c = c-wi; // 
            }else{
                profit = profit+(ci+wi)*c;
                break;
            }

        }
        System.out.println(profit);
    }
    public static void main(String[] args) {
        int a []= {4,2,5};
        int b[] = {10,20,15};
        knap(a, b, 5);
    }
}
