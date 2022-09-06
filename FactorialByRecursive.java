
class FactorialByRecursive{
    public static void main(String[] args){
        
        int n = 14;
        long start = System.nanoTime();
        int fact = factorial(n);
        long duration = System.nanoTime() - start;
        System.out.println(n+"! = "+fact);

        System.out.println(duration + " ns");
    }
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return 1;
        }
        else{
            return n*factorial(n - 1);
        }
    }
}