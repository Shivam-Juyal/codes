import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int rows = scn.nextInt();
        int nst = 1;

        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= rows/2; j++){
                if (i == rows / 2 + 1){
                    System.out.print("*	");
                }else{
                    System.out.print("	");
                }
            }
            for (int j = 1; j <= nst; j++){
                System.out.print("*	");
            }
            System.out.println();
            if (i <= rows / 2){
                nst++;
            }else{
                nst--;
                
            }
        }
    }

}