 public class Bubble_sorting{
    public static void Bubblesort(int arr[]){
        int n = arr.length;
        boolean flag= false;
        for(int i= 0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                // last element are already sorted so using n-i-1
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                    flag= true;
                    // if array is unsorted then swap will done that leads to flag true  
                }
            }
            if(flag==false){ // this block of code is for optimize the best case scenario which is showing that if the array is already sorted then no need to traverse the array just return
                return;
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