import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int rows = scn.nextInt();

        int nsp = rows / 2;
        int nst =1;


        for (int i = 1; i <=rows; i++) 
        {
            for(int j=1;j<=nsp;j++)
            {
                System.out.print("	");
            }
            
            for(int j=1;j<=nst;j++)
            {
                if(j== 1 || j== nst){
                System.out.print("*	");    
                }
                else{
                    System.out.print("	");
                }
                
            }
            System.out.println();
            
            if(i<=rows/2){
                nsp--;
                nst+=2;
            }else{
                nsp++;
                nst-=2;
            }
        }


    }
}