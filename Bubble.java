public class Bubble {
    public void bubbleSort(int arr[]){
        int len = arr.length;
        for (int i = 0;i<len-1;i++){
            for(int j = 0;j<len-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j ]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0;i<len;++i){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Bubble b = new Bubble();
        int arr[]= {23,3,1,55,3};
        b.bubbleSort(arr);
    }
}
