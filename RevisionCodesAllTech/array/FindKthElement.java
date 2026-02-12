import java.util.*;
public class FindKthElement {
    public static void main(String x[]){

   
    int a[]=new int [5];
    Scanner sc=new Scanner(System.in);
   
    System.out.println("enter arrays elements");
    for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
    }
    System.out.println("enter kth element which you want find ");
    int k=sc.nextInt();
    if(k>0 && k<=a.length){
        System.out.println("Kth element is : "+a[k-1]);

    }
    else{
        System.out.println("Invalid Kth element ");
    }
    }   
}
