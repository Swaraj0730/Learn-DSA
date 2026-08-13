package Mis;
class RecursiveBubbleSort{

    public static int[] Bubble_sort(int arr[],int k){

        if(k==0 || k==1){
            return arr;
        }

        for (int i = 0 ; i < k-1 ; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i]; 
                arr[i] = arr[i+1];
                arr[i+1] = temp ;
            }
        }
        return Bubble_sort(arr,k-1);

    }
    public static void main(String[] args) {

        int arr[] = {5,1,3,5,7,7,4,9};
        Bubble_sort(arr,arr.length);

        for (int num : arr) {
            System.out.print(num + " ");
        }
        
    }
}