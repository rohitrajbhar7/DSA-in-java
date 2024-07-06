public class selection_sorting{
    public static void selectionSort(int arr[]){
        int n= arr.length;
        for(int i=0; i<n-1; i++){
            int min_value= i; // min_value is storing the index of i
            for(int j=i+1; j<=n-1; j++){
                if(arr[j]<arr[min_value]){
                    min_value=j;// if the value of j is smaller than value of min_value then min-value store the index of j
                }
            }
            // the now the min-value holding the minimum index and i holding the position index of minimum value where the real minimum value should se kept
            int temp= arr[i];
            arr[i]= arr[min_value];
            arr[min_value]= temp;
            // just swapping the minimum value(arr[min-value]) at right position(arr[i])
        }
    }
    public static void main(String args[]){
        int arr[]={5,2,7,3,9,1};
        selectionSort(arr);
        for(int i=0; i<=arr.length-1; i++){
            System.out.println(arr[i]);
        }
    }
}