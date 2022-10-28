import java.util.Scanner;
public class FractionalKnapsack {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //Input n
        
        double w[] = new double[n]; //Input w array
        for(int i=0; i<n; i++) {
            w[i] = sc.nextInt();
        }

        double v[] = new double[n]; // Input v array
        for(int i=0; i<n; i++) {
            v[i] = sc.nextInt();
        }

        double maxWeight = sc.nextInt(); // Input Maximum Weight

        sc.close();

        double vbyw[] = new double[n]; //v by w
        for(int i=0; i<n; i++) {
            vbyw[i] = v[i] / w[i];
        }
        
        // Sorting of vbyw array and respectively v and w array
        for(int i=0; i<=vbyw.length; i++) { 
            for(int j=0; j<vbyw.length-1; j++){
                if(vbyw[j] < vbyw[j+1]){

                    double temp1 = vbyw[j];
                    vbyw[j] = vbyw[j+1];
                    vbyw[j+1] = temp1;

                    double temp2 = v[j];
                    v[j] = v[j+1];
                    v[j+1] = temp2;

                    double temp3 = w[j];
                    w[j] = w[j+1];
                    w[j+1] = temp3;
                }
            }
        }

        // //Print all arrays after sorting
        // for(int i=0; i<n; i++){
        //     System.out.println("vbyw array\n");
        //     System.out.print(vbyw[i]+" ");
        // }
        // for(int i=0; i<n; i++){
        //     System.out.println("v array\n");
        //     System.out.print(v[i]+" ");
        // }
        // for(int i=0; i<n; i++){
        //     System.out.println("w array\n");
        //     System.out.print(w[i]+" ");
        // }

        //Initialize array x with all zeroes
        double x[] = new double[n];
        for(int i=0; i<n; i++){
            x[i] = 0;
        }

        //FractionalKnapsack Core Implementation
        double Weight = 0;
        int i=0;
        while(i<n && Weight < maxWeight){
            if(Weight + w[i] <= maxWeight){
                x[i] = 1;
            }
            else{
                x[i] = (maxWeight - Weight) / w[i];
            }
            Weight = Weight +x[i] * w[i];
            i++;
        }
        
        System.out.println("Fractional Knapsack Solution");
        System.out.println();
        for(int k = 0 ; k<x.length; k++){
            System.out.println(x[k]+"th fraction of (weight : "+w[k]+ " value : "+v[k]+")");
        }
       
    }
    
}
