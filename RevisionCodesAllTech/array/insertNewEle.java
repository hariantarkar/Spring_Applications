import java.util.*;
public class insertNewEle {
    public static void main(String x[]){
        Scanner sc=new Scanner(System.in);

        int a[]=new int [6];
        int i;
        System.out.println("enter a arrays elements ");
        for(i=0;i<a.length-1;i++){
            a[i]=sc.nextInt();

        }
        System.out.println("enter element and index where you to insert");
        int element=sc.nextInt();
        int index=sc.nextInt();
        for(i=a.length-2;i>=index;i--){
            a[i+1]=a[i];
        }
        
        a[index]=element;
        System.out.println("after insert element array is ");
        for(i=0;i<a.length;i++){
            System.out.println(""+a[i]);

        }
    }
    
}
