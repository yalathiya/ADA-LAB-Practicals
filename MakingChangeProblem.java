import java.util.*;
class MakingChangeProblem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int targetAmount = sc.nextInt();
        int availableCoins = sc.nextInt();
        int d[] = new int[availableCoins]; //Array of coin denomination 
        for(int i=0; i<d.length; i++){
            d[i] = sc.nextInt();
        }

        sc.close();

        int dp[] = new int[targetAmount+1];
        Arrays.fill(dp, -1);

        dp[0] = 0;

        int ans = minCoins(targetAmount, d, dp);
        System.out.println("Minimum required coins: "+ans);

        // for(int x: dp){
        //     System.out.print(x+" ");
        // }

    }

    static int minCoins(int targetAmount, int d[], int dp[]){ 
        if(targetAmount == 0){
            return 0;
        }

        int ans = Integer.MAX_VALUE;

        for(int i=0; i<d.length; i++){
            if(targetAmount-d[i] >= 0){
                int subAns = 0;
                if(dp[targetAmount-d[i]] != -1){
                    subAns = dp[targetAmount-d[i]];
                }
                else{
                    subAns = minCoins(targetAmount-d[i], d, dp);
                }
                if(subAns != Integer.MAX_VALUE && subAns+1 < ans){
                    ans = subAns+1;
                }
            }
        }
        return dp[targetAmount] = ans;
    }
}








// Algorithm given by ma'am
// import java.util.*;

// public class MakingChangeProblem {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int targetAmount = sc.nextInt();
//         int coinsAvailable = sc.nextInt(); //How many coins denomination are there
//         int d[] = new int[coinsAvailable]; //Array of coin denomination
//         for(int i=0; i<coinsAvailable; i++){
//             d[i] = sc.nextInt();
//         }

//         sc.close();

//         int C[][] = Making_Change_DynamicProg(d, d.length, targetAmount);

//         int solution[] = Making_Change_Select_Coins(C, d, d.length, targetAmount);

//         System.out.println(".....");
//         for(int i=0; i<solution.length; i++){
//             System.out.println(solution[i]);
//         }

//     }

//     static int[][] Making_Change_DynamicProg(int d[], int n, int N){ //n = d.length N = targetAmount
//         int C[][] = new int[n][N];
//         for(int i = 0; i<n; i++){
//             C[i][0] = 0;
//         }
//         for(int i =0; i<n; i++){
//             for(int j=1; j<=N; j++){
//                 if(i==1 && j<d[i]){
//                     C[i][j] = Integer.MAX_VALUE;
//                 }
//                 else if(i==1){
//                     C[i][j] = 1+C[i][j-d[i]];
//                 }
//                 else if(j<d[i]){
//                     C[i][j] = C[i-1][j];
//                 }
//                 else{
//                     C[i][j] = Minimum (C[i-1][j], 1+C[i][j-d[i]]);
//                 }
//             }
//         }
//         return C;
//     }

//     static int[] Making_Change_Select_Coins(int C[][], int d[], int n, int N){

//         int solution[] = new int[n]; 
//         Arrays.fill(solution, -1);

//         int index = 0;
//         int i = n;
//         int j = N;
//         if(C[i][j] == Integer.MAX_VALUE){
//             return solution;
//         }

//         while(i !=0 && j!=0){
//             if(C[i][j] == C[i-1][j]){
//                 i = i-1;
//             }
//             else{
//                 solution[index] = d[i];
//                 index++;
//                 j = j-d[i];
//             }
//         }
//         return solution;
//     }

//     static int Minimum(int a, int b){
//         if(a<b){
//             return a;
//         }
//         return b;
//     }
    
// }
