import java.util.*;
public class FindDuplicateEle {
    public static void main(String x[]){
        int a[]=new int[7];
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter arrays element ");
         for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
         } 
        Arrays.sort(a);
        System.out.print("Duplicate element is ");
        for(int i=0;i<a.length-1;i++)
        {   if(a[i]==a[i+1])
            {  System.out.print("\t"+a[i]);
                while (i<a.length-1 && a[i]==a[i+1]) {
                    i++;   
                }
            }
        }
    }
}