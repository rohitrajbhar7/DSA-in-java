 public class Bubble_sorting{
    public static void Bubblesort(int arr[]){
        int n = arr.length;
        for(int i= 0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                // last element are already sorted so using n-i-1
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {9,5,7,6,2,4};
        Bubblesort(arr);
        for(int i=0; i<=arr.length-1; i++){
            System.out.println(arr[i]);
        }
    }
}