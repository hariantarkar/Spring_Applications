import java.util.*;

public class deleteArrEle {
    public static void main(String x[]){
         Scanner sc =new Scanner(System.in);
            int a[]=new int[5];
            int count=0;
         System.out.println("enter arrays elements");
         for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
         }


         System.out.println("enter element which you want to delete ");
         int element=sc.nextInt();

         for(int i=0;i<a.length-count;i++){

            if(a[i]==element){
                for(int j=i;j<a.length-1-count;j++){

                    a[j]=a[j+1];

                }
                count++;
                i--;
            }
         }

         for(int i=0;i<a.length-count;i++){
            System.out.println("  .."+a[i]);
         }


    }   
}
