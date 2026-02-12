import java.util.*;
public class MoveAllZeroEnd {
    public static void main(String x[]){
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);

        System.out.println("enter arrays elments :");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        //first ways
        // int j=0,temp;
        // for(int i=0;i<a.length;i++){
        //     if(a[i]!=0){
        //         temp=a[i];
        //         a[i]=a[j];
        //         a[j]=temp;
        //           j++;
        //     }
        // }
        // System.out.println("after moving zero to end arrays is :");

        //second ways .
        int index=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                a[index++]=a[i];
            }
        }
        while (index<a.length) {
            a[index++]=0;
            
        }
        for(int k=0;k<a.length;k++){
            System.out.print(" "+a[k]);

        }
    }
}

