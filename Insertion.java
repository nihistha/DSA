//make a key value and compare it with all the previous value in an array
//ex key value is always 1 index and so index 0 is the previous value

public class Insertion {
    public void insertion(int arr[]){
        int len = arr.length;
        for (int i = 1 ; i<len ;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        for(int i = 0;i<len;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Insertion i = new Insertion();
        int arr[] = {23,4,22,6,1};
        i.insertion(arr);
    }
}
