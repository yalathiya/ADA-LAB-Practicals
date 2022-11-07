import java.util.*;
public class JobSchedulingProblem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //Input n
        
        int jobs[] = new int[n]; //Jobs Initialization e.g. jobs[0] = 1, jobs[1] = 2,...
        for(int i=0; i<n; i++) {
            jobs[i] = i+1;
        }

        int profit[] = new int[n]; //Input Profit
        for(int i=0; i<n; i++) {
            profit[i] = sc.nextInt();
        }

        int deadline[] = new int[n]; //Input deadline
        for(int i=0; i<n; i++) {
            deadline[i] = sc.nextInt();
        }

        sc.close();

        //Sorting all arrays in descending order of profit. 
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n-1; j++){
                if(profit[j] < profit[j+1]){

                    int temp1 = profit[j];
                    profit[j] = profit[j+1];
                    profit[j+1] = temp1;

                    int temp2 = deadline[j];
                    deadline[j] = deadline[j+1];
                    deadline[j+1] = temp2;

                    int temp3 = jobs[j];
                    jobs[j] = jobs[j+1];
                    jobs[j+1] = temp3;
                }
            }
        }

        //Sorted array check 
        // for(int i=0; i<n; i++){
        //     System.out.println("Jobs : "+jobs[i]+"Profit : "+profit[i]+ " Deadline: "+deadline[i]);
        // }

        int maxDeadline = deadline[0];
        for(int i=0; i<n; i++){
            if(deadline[i] > maxDeadline){
                maxDeadline = deadline[i];
            }
        }

        // System.out.println("Max Deadline :"+maxDeadline);

        int solDeadlineArray[] = new int[maxDeadline];
        for(int i=0; i<maxDeadline; i++){
            solDeadlineArray[i] = i+1;
        }

        int scheduledJob[] = new int[maxDeadline];
        for(int i=0; i<scheduledJob.length; i++){
            scheduledJob[i] = 0;
        }
        //print solDeadlineArray
        // for(int i=0; i<solDeadlineArray.length; i++){
        //     System.out.println(solDeadlineArray[i]);
        // }

        int netProfit = 0;
        
        for(int i=0; i<deadline.length; i++){
            for(int j=deadline[i]-1; j>=0; j--){
                if(scheduledJob[j] == 0){
                    scheduledJob[j] = jobs[i];
                    netProfit = netProfit + profit[i];
                    break;
                }
            }
        }

        //Check ScheduleJob Array 
        System.out.println(".....");

        for(int i=0; i<scheduledJob.length; i++){
            System.out.println("job "+scheduledJob[i]+" is selected");
        }

        //Net Profit
        System.out.println("Net Profit :"+netProfit);
    }
    
}
