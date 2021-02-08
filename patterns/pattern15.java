import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        
        int space = n/2;
        int star = 1;
        int count=0;
        
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=space;j++)
            {
                System.out.print("	");
            }
            
            for(int j=1;j<=star;j++)
            {
                if(i==1 || i==n){
                System.out.print(++count+"	");    
                }
                else if(j<=star/2+1){
                    System.out.print(++count+"	");
                }
                else{
                    System.out.print(--count+"	");
                } 
                
            }
            
            System.out.println();
            
            if(i<=n/2)
            {
                space--;
                star+=2;
            }
            else
            {
                space++;
                star-=2;
                count-=2;
            }
            
        }

    }
}