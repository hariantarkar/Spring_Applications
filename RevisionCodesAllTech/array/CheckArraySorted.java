import java.util.*;
public class CheckArraySorted {
    public static void main(String x[]){
        int a[]=new int [5];
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter arrays elments...");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();

        }
        boolean ascending=true,desceding=true;

        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                ascending=false;
                
            }
           if (a[i]<a[i+1]) {
            desceding=false;    
            } 
        }
        if(ascending){
            System.out.println("arrays is sorted in ascending order ");
        }
        else if(desceding){
            System.out.println("arrays is sorted in descending order");
        }
        else{
             System.out.println("arrays is not  sorted");
        }
    }
}
