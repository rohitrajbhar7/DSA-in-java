public class MergeSorting{
    public static void display(int arr[]){
        for(int val: arr) System.out.print(val+" ");
    }
    public static void merge(int arr[], int mid, int l, int r){
        int n1= mid-l+1; // 2-0+1=3
        int n2= r-mid; //  5-2=3
        int left[]= new int[n1]; // creating left half array which is blank now
        int right[]= new int[n2]; // creating right half array which is blank now
        
        int i,j,k;
        for(i=0; i<n1; i++){ // putting the values of left array from original half sorted array
            left[i]=arr[l+i];
        }
        for(j=0; j<n2; j++){ // putting the values of left array from original half sorted array
            right[j]=arr[mid+1+j];
        }

            i=0;
            j=0;
            k=l;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k]=left[i]; // putting the minimum values from left or right sorted array to the original array arr
                k++;
                i++;
            }else{
                arr[k]=right[j];
                k++;
                j++;
            }
        }

        while(i<n1){// suppose the right array finished then put all the left array values in the original values
            arr[k++]=left[i++];
        }
        while(j<n2){// vise versa
            arr[k++]=right[j++];
        }
    }
    public static void mergeSort(int arr[], int l, int r){
        if(l>=r){
            return; // if there will be only single array element then return ; or if the value of l==r then return
        }
        int mid= (l+r)/2; // finding the mid of the array arr  0+5/2=2
        mergeSort(arr,l,mid); // deviding the left sorted half array
        mergeSort(arr,mid+1,r);// deviding the right sorted half array
        merge(arr,mid,l,r); // merging the two half sorted array in a single original array 
        // display(arr);
    }
    public static void main(String args[]){
        int arr[] = {5,3,7,9,1,6};
        int l=0;
        // int r= arr.length-1;
        int n= arr.length;
        display(arr);
        mergeSort(arr,l,n-1);
        System.out.println();
        display(arr);
    }
}