import java.util.Arrays;
import java.util.concurrent.CompletableFuture;

public class AsyncExample {
    static int calculateSum(int a[]){
        try{
            Thread.sleep(2000);
        }
        catch(Exception ee){ee.printStackTrace();}
        return Arrays.stream(a).sum();
    }
    public static void main(String[] args) {
        int a[] = {1,2,3};
        CompletableFuture<Integer> calculateSum = CompletableFuture.supplyAsync(()->calculateSum(a)); 
                CompletableFuture<Integer> squre = calculateSum.thenApplyAsync(result-> result*result);
        CompletableFuture<Void> printresult = squre.thenAcceptAsync(result ->System.out.println("result :"+result));
        System.out.println("print aaaaa");
        printresult.join();

    }

}
