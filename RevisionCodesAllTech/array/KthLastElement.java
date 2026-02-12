import java.util.*;

public class KthLastElement {
  public static void main(String s[]){
    int a[]=new int [5];
    Scanner sc=new Scanner(System.in);
   
    System.out.println("enter arrays elements");
    for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
    }
    System.out.println("enter kth last element which you want to find ");
    int k=sc.nextInt();
    if(k>0 && k<=a.length){
        System.out.println("Kth last element is : "+a[a.length-k]);

    }
    else{
        System.out.println("Invalid Kth last element ");
    }
}  
}
