import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int sp= (2*n)-3;
        
        int num=1;
        
        for(int i=1;i<=n;i++)
        {
           for(int j=1;j<=num;j++)
           {
                   System.out.print(j+"	");
           }
           
           for(int j=1;j<=sp;j++)
           {
               System.out.print("	");
           }
           
           if(i==n)
           {
               num--;
           }
           for(int j=num;j>=1;j--)
           {
               System.out.print(j+"	");
           }
           System.out.println();
           
           num++;
           sp-=2;
           
        }
        

    }
}