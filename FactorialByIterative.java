
class FactorialByIterative{
    public static void main(String[] args){
        
        int n = 14;
        long start = System.nanoTime();
        int fact = 1;

            for(int i=n; i>0; i--){
                fact *= i;
            }
            long duration = System.nanoTime() - start;
            System.out.println(n+"! = "+fact);
            
        System.out.println(duration + " ns");
    }
}