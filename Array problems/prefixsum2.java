// Given an array of intgers of size n . answer q queries where you need to print the sum of values in a given range of indices from l to r (both included).
// note -> the values of l and r in the queries follow 1 based indexing.

import java.util.Scanner;
public class sum_Indices{
    
    static void printArray(int[] ar){
        for(int i = 1 ; i<ar.length; i++){
            System.out.print(ar[i]+" ");
        }
    }
    
    static int[] inputArray(){
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int ar[]= new int[n+1];
        System.out.println("Enter your array");
        for(int i=1; i<=n; i++){
            ar[i]= sc.nextInt();
        }
        return ar;
    }
    
    static int[] prefix_sum(int arr[]){
        for( int i=1; i<arr.length; i++){
            arr[i]= arr[i-1]+arr[i];
        }
        return arr;
    }
    
    
    public static void main(String []args){
        
        int[] arr= inputArray();
        printArray(arr);
        
        int[] sum= prefix_sum(arr);
        System.out.println();
        printArray(sum);
        
        Scanner sc = new Scanner(System.in);
         System.out.println();
         System.out.println("enter the number of queries");
        int query= sc.nextInt();
        while(query-->0){
             System.out.println("enter your range between 0 to 5 ");
             System.out.print("From ");
             int l= sc.nextInt();
             System.out.print("To ");
             int r= sc.nextInt();
             
             int ans = sum[r]- sum[l-1];
             System.out.println("your answer is "+ ans);
        }
    }
}