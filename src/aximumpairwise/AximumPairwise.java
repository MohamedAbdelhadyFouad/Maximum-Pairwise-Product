

package aximumpairwise;

import java.util.Arrays;
import java.util.Scanner;


public class AximumPairwise {

    static public long findmax( long a[], int size){
      long b= a[size-1]*a[size-2];
      
        return b;
    }
    public static void main(String[] args) {
        
       Scanner sc= new Scanner(System.in);
       int size=sc.nextInt();
      
        long arr []= new long [size];
        
        for (int i = 0; i < size; i++) {
           
           arr[i]=  sc.nextLong();
            
        }
        Arrays.sort(arr);
        System.out.println(findmax(arr,size)); 
        //System.out.println(Arrays.toString(arr));
       
    }

}
