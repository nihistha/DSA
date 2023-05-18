import javax.xml.stream.events.StartElement;

public class MergeSort {
    public void merge(int arr[],int start,int mid,int end){
        int len = arr.length;
        int n1 = mid -start +1;
        int n2 = end - mid;
        int l[] = new int[len];
        int r[] = new int[len];

        for(int i = 0;i<n1;i++){
            l[i]=arr[i];
        }
        for(int j = 0;j<n2;j++){
            r[j]=arr[mid+1+j];
        }

        int i = 0;
        int j = 0;
        int k = start;
        while(i<n1 && j<n2){
            if (l[i]<=r[j]){
                arr[k] =l[i];
            }
        }
        
    }
    public void mergeSort(int a[],int start,int end){
        int mid = (start + end )/2;
        mergeSort(a,start,mid);
        mergeSort(a, mid+1, end);
        
    } 
}
