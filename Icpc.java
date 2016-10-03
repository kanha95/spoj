
import java.util.*;


public class Icpc {
static int[] dp=new int[10];

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        
       int t=sc.nextInt();
       for(int i=1;i<=t;i++){
           int n=sc.nextInt();
           int k=sc.nextInt();
           int[] ar=new int[k+1];
           for(int j=1;j<=k;j++){
               int s=sc.nextInt();
               if(s==-1) ar[j]=Integer.MAX_VALUE;
               else
               ar[j]=s;
               
              
           }
           int[] ans=new int[k+1];
           ans[0]=0;
           ans[1]=ar[1];
           for(int p=2;p<=k;p++){
               ans[p]=Integer.MAX_VALUE;
               for(int q=1;q<=p;q++){
                   if((ar[q]+ans[p-q])<ans[p]){
                       ans[p]=ar[q]+ans[p-q];
                   }
               }
           }
           if(ans[k]==Integer.MAX_VALUE || ans[k]<0){
               System.out.println("-1");
           }else{
               System.out.println(ans[k]);
           }
           
       }
       
       
       }
       
       
    }
    

