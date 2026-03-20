import java.util.*;
public class AllPrimeNumUpToN {

    public static  void main(String x[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Num ");
        int num=sc.nextInt();
        for(int i=2;i<=num;i++)
        {
         boolean isprime=true;
            for(int j=2;j<=i/2;j++){
                 if(i%j==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                System.out.print(i+"\t");
                
            }
        }
        
    }
}
