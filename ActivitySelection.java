import java.util.*;
public class ActivitySelection {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //Input n
        
        int s[] = new int[n]; //Input starting time
        for(int i=0; i<n; i++) {
            s[i] = sc.nextInt();
        }

        int f[] = new int[n]; // Input finishing time
        for(int i=0; i<n; i++) {
            f[i] = sc.nextInt();
        }

        sc.close();

        //Sort the input activities by increasing finishing time. f1 ≤ f2 ≤ . . . ≤ fn

        for(int i=0; i<n; i++) {
            for(int j=0; j<n-1; j++){
                if(f[j] > f[j+1]){

                    int temp1 = f[j];
                    f[j] = f[j+1];
                    f[j+1] = temp1;

                    int temp2 = s[j];
                    s[j] = s[j+1];
                    s[j+1] = temp2;
                }
            }
        }

        //Implementation of Activity Selection Algorithm
        int i=0;

        int selectedActivity[] = new int[n];
        selectedActivity[0] = i; //first activity is selected.
        int index = 1; //this index represents next activity to be selected in selectedActivity array.

        int j=0;

        for(i=1; i<n; i++){
            if(s[i] >= f[j]){
                selectedActivity[index] = i;
                index++;
                j=i;
            }
        }

        // System.out.println("Array of Selected Activity");
        // for(int k=0; k<selectedActivity.length; k++){
        //     System.out.println(selectedActivity[k]);
        // }

        System.out.println("Selected Activities: ");
        System.out.println(" starting time: "+s[selectedActivity[0]]+" finished time: "+f[selectedActivity[0]]);
        for(int k=1; k<selectedActivity.length; k++){
            if(selectedActivity[k] != 0){ //this condition is applied because selectedActivity array contains value as 0 which shhould be null value and that activities are not selected..(Refer Above comment || It's self explenatory..) 
                System.out.println(" starting time: "+s[selectedActivity[k]]+" finished time: "+f[selectedActivity[k]]);
            }
        }
        
    }
    
}
