// import java.util.Scanner;
class InsertionSort{
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // int n;
        // n = sc.nextInt();
        int n = 1000;
        int comparision = 0;
        int shift = 0;
        int arr[] = new int[n];

        //Input the data

        int r = 0;
        int num = arr.length - 1 ;
        while(r < arr.length) {
            arr[r] = num;
            num--;
            r++;
        }

        // for(int i =arr.length - 1; i >= 0; i--){
        //     arr[i] = i;
        // }
        // sc.close();
        
        long start = System.nanoTime();
        // Insertion Sort
        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > current  ){
                arr[j+1] = arr[j];
                j = j-1;
                shift++;
                comparision++;   
            }
            comparision++;
            arr[j+1] = current;
            

        }

        long duration = System.nanoTime() - start;
        // System.out.println(duration + " ns");
        //Output Print
        System.out.println("Sorted Array");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        
        System.out.println("\nComparision: "+ comparision);
        System.out.println("Shifts: "+shift);
        System.out.println(duration + " ns");
    }
    
}