import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        // write ur code here
         int n = scn.nextInt();
        
        int rows = n;
        int cols = n+2;
        
        int space = 1;
        
        int star = (n+2)/2;
        
        
        for(int i=1;i<=rows;i++)
        {
            
                for(int f=1;f<=star;f++)
                {
                    System.out.print("*	");
                }
                
                for(int f=1;f<=space;f++)
                {
                    System.out.print("	");
                }
                
                for(int f=1;f<=star;f++)
                {
                    System.out.print("*	");
                }
                
                System.out.println();
                
                if(i<=n/2)
                {
                    
                space+=2;
                star--;
                
                }
                else
                {
                  space-=2;
                  star++;   
                }
           
            }
        }
        

    }