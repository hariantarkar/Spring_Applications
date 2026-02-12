import java.util.*;
public class revarr{

    public static void main(String arg[]){
        int []a=new int [5];
        int temp;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter  arrays elements");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();

        }
        System.out.print("original array is ");
        for(int i=0;i<a.length;i++){
            System.out.print("\t"+a[i]);

        }

        for(int i=0,j=a.length-1;i<j;i++,j--){

            temp=a[i];
            a[i]=a[j];
            a[j]=temp;


        }

        System.out.print("\n After reverse  array is   ");

        for(int i=0;i<a.length;i++){
            System.out.print("\t"+a[i]);

        }
    }
}
