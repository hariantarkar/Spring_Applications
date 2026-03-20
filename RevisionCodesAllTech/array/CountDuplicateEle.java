import java.util.*;
public class CountDuplicateEle {
 
    public static void main(String x[]){
        int a[]=new int [5];
        Scanner sc=new Scanner(System.in);

        System.out.println("enter arrays elements");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
       
        for(int i=0;i<a.length-1;i++){
             int count=1;
            if(a[i]==a[i+1]){
                while (i<a.length-1 && a[i]==a[i+1]) {
                    count++;
                    i++;
                }
                System.out.println(a[i]+"Appears in " + count +"times");
            }
        }
    }
}
