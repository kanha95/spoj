
package spoj3;
import java.util.*;

public class Spoj3 {

  
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       boolean b=true;
       
       while(b){
           
        String s=sc.next();
        int[] dp=new int[s.length()+1];
        dp[0]=dp[1]=1;
        
        if(s.equals("0")){
            b=false;
            break;
        }
        int x=1;
        for(int i=2;i<=s.length();i++){
            String curr=""+s.charAt(i-2);
            String next=""+s.charAt(i-1);
            
            dp[i]=dp[i-1];
           if(Integer.parseInt(curr+next)<=26){
               dp[i]=dp[i]+dp[i-2];
           }
           
        }
        System.out.println(dp[s.length()]);
        
        
        
    }
    
}
}
