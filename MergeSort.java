import javax.xml.stream.events.StartElement;
//O(n log n)

public class MergeSort {
    public void merge(int arr[],int start,int mid,int end){
        int n1 = mid -start +1; // the length will be 3
        int n2 = end - mid; //the length will be four
        int l[] = new int[n1];  
        int r[] = new int[n2];

        for(int i = 0;i<n1;i++){
            l[i]=arr[start +i]; // puts the value of start + i  in l[i]
        }
        for(int j = 0;j<n2;j++){
            r[j]=arr[mid+1+j]; // puts the values after mid in r[j]
        }

        int i = 0;
        int j = 0;
        int k = start; //start = 0
        while(i<n1 && j<n2){
            if (l[i] < r[j]){
                arr[k] =l[i]; //
                i++;
            }else{
                arr[k] = r[j];
                j++;
            }
            k++;
        }
        while (i<n1){
            arr[k] = l[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] =r[j];
            j++;
            k++;
        }
        
    }
    public void mergeAgain(int[] arr, int start, int mid,int end){
        int n1 = mid - start+1; 
        int n2 = end - mid;
        int l[] = new int[n1];
        int r[] = new int[n2];
        for(int i = 0;i<n1;i++){
            l[i] =arr[start+i];
        }
        for(int j=0;j<n2;j++){
            r[j] = arr[mid+1+j];
        }
        int i = 0;
        int j = 0;
        int x = start; //v imp
        while(i<n1 && j<n2){
            if(l[i]<r[j]){
                arr[x] = l[i];
                i++;
            }else{
                arr[x] = r[j];
                j++;
            }
            x++;
        }
        while(i<n1){
            arr[x] = l[i];
            i++;
            x++;
        }
        while(j<n2){
            arr[x] = r[j];
            j++;
            x++;
        }
    }
    public void mergeSort(int a[],int start,int end){
        if(start < end){
        int mid = (start + end )/2;
        mergeSort(a,start,mid);
        mergeSort(a, mid+1, end);
        mergeAgain(a, start, mid, end);
        }
        
    } 
    public void print(int arr[]){
        for (int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        MergeSort m = new MergeSort();
        int arr[] = {23,3,55,2,1,0};
        m.mergeSort(arr,0,arr.length-1);
        m.print(arr);
    }
}
