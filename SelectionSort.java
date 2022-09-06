// import java.util.Scanner;
class SelectionSort{
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // int n;
        // n = sc.nextInt();
        int n = 1000;
        int comparision = 0;
        int swaps = 0;
        int arr[] = new int[n];

        //Input the data

        int r = 0;
        int num = arr.length - 1 ;
        while(r < arr.length) {
            arr[r] = num;
            num--;
            r++;
        }

        // for(int i = arr.length - 1; i >= 0; i--){
        //     arr[i] = i;
        // }
        // sc.close();

        long start = System.nanoTime();
        //Selection Sort

        for(int i = 0; i < arr.length - 1; i++){
            int min = arr[i];
            int position = i;
            for(int j = i+1; j<arr.length ; j++){
                if(min > arr[j]){
                    min = arr[j];
                    position = j;
                }
                comparision++;
            }
            int temp = arr[i];
            arr[i] = arr[position];
            arr[position] = temp;
            swaps++;
        }

        long duration = System.nanoTime() - start;
        // System.out.println(duration + " ns");
        //Print Sorted Array
        
        System.out.println("Sorted Array");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }

       
        System.out.println("\nComparision: "+ comparision);
        System.out.println("Swaps: "+swaps);
        System.out.println(duration + " ns");
    }
    
}