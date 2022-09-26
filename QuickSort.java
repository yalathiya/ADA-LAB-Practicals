// import java.util.Scanner;
class QuickSort{
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // int n;
        // n = sc.nextInt();
        int n = 10;
        
        int arr[] = new int[n];

        //Input the data

        int m = 0;
        int num = arr.length - 1 ;
        while(m < arr.length) {
            arr[m] = num;
            num--;
            m++;
        }

        // for(int i =arr.length - 1; i >= 0; i--){
        //     arr[i] = i;
        // }
        // sc.close();
        
        long start = System.nanoTime();

        // Quick Sort
        int p = 0 ;
        int r = arr.length - 1 ;
        QuickSortMethod(arr, p, r);


        long duration = System.nanoTime() - start;
        // System.out.println(duration + " ns");
        //Output Print
        System.out.println("Sorted Array");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
        System.out.println(duration + " ns");
    }

    public static void QuickSortMethod(int arr[], int p, int r){
        if(p<r){
            int q = partition(arr, p ,r);
            QuickSortMethod(arr, p , q-1);
            QuickSortMethod(arr, q+1, r);
        }
    }

    public static int partition(int arr[], int p, int r){
        int x = arr[r];
        int i = p-1;
        for(int j = p ; j<r; j++){
            if(arr[j] < x){
                i = i+1;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp; 
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;

        return i+1;
    }
}