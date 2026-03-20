import java.util.*;
public class PrimeNum {
    public static void main(String x[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num which you want check prime or not  ");
        int num=sc.nextInt();
       
        
        // int count=0;
        // for(int i=1;i<=num;i++){
        //     if(num%i==0){
        //         count++;
        //     }
        // }
        //     if(count==2){
        //         System.out.println("no is prime ");
        //     }
        
        //     else{
        //         System.out.println("no is not prime ");
        //     }
        
        boolean isprime=true;
        for(int i=2;i<num/2;i++){
            if(num%i==0){
                isprime=false;
                break;
            }
        }
        if(isprime){
            System.out.print("No is prime ");
        }
        else{
            System.out.println("No is not prime ");
        }
    }
}
