import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        
        int x = scn.nextInt();
        int count=1;
        
        for(int i=0;i<x;i++)
        {
            for(int f=0;f<=i;f++)
            {
                System.out.print(count++ +"	");
            }
            System.out.println();
        }

    }
}