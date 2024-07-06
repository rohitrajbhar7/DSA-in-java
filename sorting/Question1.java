// given an integer array arr, move all 0's to the end of it while maintaining the relative order of the non-zero elements
// note that you must do this in place without making a copy of the array
// input= 050342   output= 534200

public class Question1{

    public static void zeroesAtEnd(int arr[]){
        int n= arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=i; j<n-i-1; j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[]= {0,5,0,3,4,2};
        zeroesAtEnd(arr);
        for(int val:arr){
            System.out.println(val);
        }
    }
}