import java.util.*;
public class  MajeorityEle
{
    public static void main(String x[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[8];
        System.out.println("enter arrays elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    
        int result =findmajeorityelement(arr);
        System.out.println("mejority element is:"+result);
    }


        public static int findmajeorityelement(int []a){
            for(int i=0;i<a.length;i++){
                int count=0;
                int majeority=a[i];
                for(int j=0;j<a.length;j++){
                    if(majeority==a[j]){
                    count++;
                    }
                    if(count>a.length/2){
                    return majeority;
                    }
                }
       
            }

     return -1;
    

}
}
