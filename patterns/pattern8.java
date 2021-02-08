import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        
        int x = scn.nextInt();
        
        int space = x-1;
        
        for(int i=1;i<=x;i++)
        {
            for(int f=1;f<=space;f++)
            {
                System.out.print("	");
            }
            System.out.println("*");
            space--;
        }
        

    }
}