// import java.util.Scanner;
class BubbleSort{
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
        // sc.close();
        
        long start = System.nanoTime();

        // Bubble Sort
        for(int i = 0; i < arr.length ; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    swaps = swaps +1;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                }
                comparision++;
            }
        }
        

        long duration = System.nanoTime() - start;
        
        //Output Print
        System.out.println("Sorted Array");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("\n"+duration + " ns");
        System.out.println("Comparision: "+ comparision);
        System.out.println("Swaps: "+swaps);
    }
    
}