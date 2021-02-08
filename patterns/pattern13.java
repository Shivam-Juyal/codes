import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int in = scn.nextInt();
        
        for(int n=0;n<in;n++)
        {
            int val =1;
            for(int r=0;r<=n;r++)
            {
                System.out.print(val+"	");
                val=((n-r)*val/(r+1));
            }
            System.out.println();
        }


        
    }
}