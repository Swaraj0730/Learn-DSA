class MergeSort{

    public static  void merge(int arr[] ,int start, int mid , int last){

        int idx1 = start;
        int idx2 = mid+1;
        int k = 0 ;
        int temp[] = new int[last-start+1];

        while(idx1 <= mid && idx2 <= last){
            if(arr[idx1] < arr[idx2]){
                temp[k++] = arr[idx1++] ;
            }
            else{
                temp[k++] = arr[idx2++];
            }
        }
        while(idx1 <= mid){
            temp[k++] = arr[idx1++];
        }
        while(idx2 <= last){
            temp[k++] = arr[idx2++];
        }
         
        for (int i = 0 , j = start ; i < temp.length ; i++ , j++){
            arr[j] = temp[i] ;

        }
    }

    public static void divide(int arr[] ,int start, int last){

        if (start >= last){
            return ;
        }
        int mid = start + (last-start)/2 ;
        divide(arr,start,mid);
        divide(arr,mid+1,last);
        merge(arr,start,mid,last);

    }

    public static void main(String[] args) {
        int arr[] = {8,5,4,7,3,2,7,9,4,3,1} ;
        divide(arr,0,arr.length-1);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
    
}