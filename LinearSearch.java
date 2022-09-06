
class LinearSearch{
    public static void main(String[] args){
        

        int arr[] = new int[10000];

        for(int i=0; i<arr.length; i++){
            arr[i] = i;
        }

        //input element for search
        int ele = 9999;
        
        long start = System.nanoTime();

        int found = 0;
        int i= 0;
        while(i<arr.length){
            if(arr[i] == ele){
                found = 1;
                break;
            }
            i++;
        }

        long duration = System.nanoTime() - start;
        if(found == 0){
            System.out.println("Element Not Found");
        }
        else{
            System.out.println("Element  Found");
        }
        System.out.println(duration + " ns");

    }
}