      NESTLOOP PATTERN



import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long row,col,itr=1;
                        using itr


        for( row = 1; row <= n; row++) {
            for(col = 1; col <=itr; col++) {
                System.out.print("*" + " ");
            }
            itr++;
            System.out.println();

        // *
        // * *
        // * * *
        // * * * *
        // * * * * *



              without using itr

        for(row=1;row<=n;row++){
            for(col=1;col<=row;col++){
                System.out.print("*" + " ");
            }
            System.out.println();

        // OUTPUT

        // *
        // * *
        // * * *
        // * * * *
        // * * * * *




        for(row=1;row<=n;row++){
            for(col=n;col>=row;col--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }


        // OUTPUT
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *





        for(row=1;row<=n;row++){
            for(col=1;col<=n;col++){
                if(col<=n-row){
                    System.out.print(" ");
                }
                else
                    System.out.print("*");
            }
            System.out.println();
        }

       //OUTPUT =5
        //         *
        //       * *
        //     * * *
        //   * * * *
        // * * * * *







        for(row=n;row>=1;row--){
            for(col=1;col<=n;col++) {
                if(col<=n-row){
                    System.out.print(" ");
                }
                else
                    System.out.print("*");
            }
            System.out.println();
        }




        // //OUTPUT
        // * * * * *
        //   * * * *
        //     * * *
        //       * *
        //         *




        for(row=1;row<=n;row++) {
            for (col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            for (col = 1; col <= (row * 2 - 1); col++) {
                System.out.print("*");
            }
            System.out.println();
        }
  }
}


       //  OUTPUT

       //         *
       //       * * *
       //     * * * * *
       //   * * * * * * *
       // * * * * * * * * *
