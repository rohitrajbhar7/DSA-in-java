// import java.util.Scanner;
// public class sort_binary_Array{
//     public static int[] makeBinaryArray(int arr[]){
//         int count=0;
//         for(int i=0; i<arr.length; i++){
//             if(arr[i]==0){
//                 count += 1;
//             }
//         }
//         System.out.println("number of zeroes are "+count);
//         for(int i=0; i<count; i++){
//             arr[i]=0;
//         }
//         for(int i=count; i<arr.length; i++){
//             arr[i]=1;
//         }
//         for(int i=0; i<arr.length; i++){
//             System.out.println(arr[i]);
//         }
//         return arr;
//     }

//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the size of binary array");
//         int n= sc.nextInt();
//         int arr[]= new int[n];
//         System.out.println("Enter the size of binary array");
//         for(int i = 0; i<arr.length; i++){
//             arr[i]= sc.nextInt();
//         }
//         System.out.println("Here is you sorted binary array");
//         makeBinaryArray(arr);
//         sc.close();
//     }
    
    
// }
// here in this code there is a problem that you have traversed 2 times to the array for getting the same value 1st is for taking the 0 in front and 2nd for taking the 1s to the last

public class SortBinaryArray {
    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 0, 1, 1, 0};
        int j = arr.length - 1;

        for (int i = 0; i < j; i++) {
            while (j > i && arr[j] != 0) {
                j--;
            }
            if (arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
