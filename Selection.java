public class Selection {
    public void selectionSort(int[] arr){
        int min_idx;

        for (int i =0;i<arr.length;i++){
            min_idx = i;
            //first set the minimum idx to i or 0
            //since the iteration needs to be carried out from the element above i the nested loop runs from i+1 to arr.length
            for(int j = i+1;j<arr.length;j++){
                if(arr[min_idx]>arr[j]){ //comparing if the value in min index is greater the the value in j index if true the the min idx = j
                    min_idx = j;
                }
            }
            //when the nested iteration is completed we compare if the min idx is equal to i or not if its no tequal then the first index is swapped with the minimum value is the whole array
            if(min_idx!=i){
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Selection s = new Selection();
        int arr[] = {3,12,5,66,2};
        s.selectionSort(arr);
    }
    public void again(int[] arr){
        int minimum ;
        for (int i = 0;i<arr.length;i++){
            minimum = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[minimum] >arr[j]){
                    minimum = j;
                }
            }
            if(minimum!=i){
                int temp = arr[i];
                arr[i] = arr[minimum];
                arr[minimum] = temp;
            }
        }
    }
}
