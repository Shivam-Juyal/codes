import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int rows = scn.nextInt();

        int nsp = rows / 2;
        int nst = 1;


        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows; j++) {
                if (j<=rows/2 && j == 1 || j == rows) {
                    System.out.print("*	");
                }
                else if(i>rows/2){
                    
                    if (j == 1 || j == rows) {
                    System.out.print("*	");
                        
                    }
                    else if(j == i || j+i==rows+1){
                    System.out.print("*	");    
                    }
                    else{
                        System.out.print("	");
                    }
                    
                }
                else{
                    System.out.print("	");
                }

            }
            System.out.println();

    }
}
}