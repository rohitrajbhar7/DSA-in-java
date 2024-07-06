// Give an array of names of the fruits ; you are supposed to sort it in lexicographical order using the selection sort
// input: ["papaya", "lime","watermelon", "apple", "mango","kiwi"]
// output: ["apple", "kiwi","lime", "mango", "papaya","watemelon"]

public class Question2{
    public static void SelectionSort(String arr[]){
        int n= arr.length;
        for(int i=0; i<n-1; i++){
            int min_value= i;
            for(int j=i+1; j<n; j++){
                if(arr[j].compareTo(arr[min_value])<0){
                    min_value= j;
                }
            }
            //swap
            String temp= arr[i];
            arr[i]= arr[min_value];
            arr[min_value]= temp;
        }
    }
    public static void main(String[] args) {
        String arr[]= {"kiwi", "apple","mango","papaya"};
        SelectionSort(arr);
        for(String i: arr){
            System.out.println(i);
        }
    }
}