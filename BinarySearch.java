
public class BinarySearch {
    public static int BinarySearch(int arr[], int key, int low, int high) {
        if(low > high){
            System.out.println("Not Found");
            return -1;
        }
        int mid = ((low+high)/2);

        if(key == arr[mid]){
            System.out.println("Found");
            return 1;
        }
        
        if(key < arr[mid]){
            high = mid - 1;
            BinarySearch(arr, key, low, high);
            return 1;
        }

        else{
            low = mid +1;
            BinarySearch(arr, key, low, high);
            return 1;
        }
        
    }
    public static void main(String[] args){
        int n = 1000;
        
        int arr[] = new int[n];

        //Input the data

        for(int i =0 ; i < n ; i++){
            arr[i] = i;
        }
        
        
        long start = System.nanoTime();
        

        // Binary Search
        //input element for search
        int key = 1000;

        int low = 0;
        int high = arr.length - 1;
        BinarySearch(arr, key, low, high);

        long duration = System.nanoTime() - start;
        System.out.println(duration + " ns");
    }
}