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
    public static void main(String[] args) {
        System.out.println(coin(6)); 
    }
}
