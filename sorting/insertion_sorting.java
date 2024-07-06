public class insertion_sorting{
    public static void insertionSort(int arr[]){
        int n= arr.length;
        for(int i=1; i<n; i++){
            for(int j=i; j>0; j--){// i has been started with 1 because when j=i=1 then j can access the 0 index
                if(arr[j]<arr[j-1]){// and iff it access then compare and then sort
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]= temp;
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[]= {8,2,4,6,3,1,9};
        insertionSort(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
}