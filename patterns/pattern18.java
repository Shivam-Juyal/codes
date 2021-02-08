import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        
        int rows = scn.nextInt();
        
        for(int i =1;i<=rows;i++)
        {
            for(int j=1;j<=rows;j++)
            {
                if(i==1)
                {
                    System.out.print("*	");
                }
                else if(i==j)
                {
                    System.out.print("*	");
                }
                
                else if(i+j==rows+1)
                {
                    System.out.print("*	");
                }
                else if(i>rows/2 && i+j>=rows+1 && j<=i)
                {
                    
                    
                        System.out.print("*	");
                    
                }
                else
                {
                        System.out.print("	");    
                    
                }
            }System.out.println();
            
        }

    }
}