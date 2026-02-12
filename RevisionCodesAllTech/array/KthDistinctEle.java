import java.util.*;
public class KthDistinctEle {
    
    public  static void main(String x[]){
        int a[]=new int[5];
        int temp,count=1,i,j;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter arrays elements");
        for(i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter kth distinct element which you want find ");
        int k=sc.nextInt();
        System.out.print("given array is : ");
        for(i=0;i<a.length;i++){
            System.out.print("\t"+a[i]);
        }

        for(i=0;i<a.length;i++){
                for(j=i+1;j<a.length;j++){
                    if(a[i]<a[j]){
                        temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }

                }
        }
        System.out.println("\n\n descending order array help us to find distinct element of array : ");

        for(i=0;i<a.length;i++){
            System.out.print("\t"+a[i]);
        }

            boolean flag=false;

            for(i=0;i<a.length-1;i++){
                if (count==k){
                    flag=true;
                    System.out.println("\n Kth distinct element is : "+a[i]);
                }

                if(a[i]!=a[i+1]){
                    count++;
                }

            }
            if(flag==false){
                System.out.println("\n "+k+"\t kth distinct element not available");
            }
    }
}

