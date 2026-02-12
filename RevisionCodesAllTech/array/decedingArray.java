import java.util.*;
public class decedingArray {
    public static void main(String arr[]){

        Scanner sc=new Scanner(System.in);

        int a[]=new int [5];
        int temp;
        System.out.println("enter arrays elements");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){


                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }
        }

        System.out.println("desceding order array is ");
        for(int i=0;i<a.length;i++){
            System.out.print("\t"+a[i]);
        }
    }    
}
