import java.util.Scanner;
 class prefix_sum1{
    static void printarray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }


    static void prefix_sum(int[] ar){
        int n= ar.length;
        int pre[] = new int[n];
        pre[0]= ar[0];
        for(int i= 1 ; i<n ; i++){
            pre[i]= pre[i-1] + ar[i];
        }
        System.out.println();
        printarray(pre);
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        System.out.println("enter your array");
        int ar[] = new int[n];
        for(int i=0; i<n; i++){
            ar[i]= sc.nextInt();
        }

        printarray(ar);
        prefix_sum(ar);
    }
    
}



// given an integer array 'a'  return the prefix sum in the same array without creating a new array
// import java.util.Scanner;
//  class prefix_sum1{
//     static void printarray(int[] arr){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }


//     static void prefix_sum(int[] ar){
//         int n= ar.length;
//         for(int i= 1 ; i<n ; i++){
//             ar[i]= ar[i-1] + ar[i];
//         }
//         System.out.println();
//         printarray(ar);
//     }

//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the number of elements");
//         int n = sc.nextInt();
//         System.out.println("enter your array");
//         int ar[] = new int[n];
//         for(int i=0; i<n; i++){
//             ar[i]= sc.nextInt();
//         }

//         printarray(ar);
//         prefix_sum(ar);
//     }
    
// }