             // PSUDO BINARY NUMBER
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long pv, cons, dig;
        while (num != 0) {  //55
            pv = 1;
            cons = 0;
            while (num / pv != 0) {  //55
                dig = (num / pv) % 10; //5=5
                if (dig > 0) {   //true
                    cons = 1 * pv + cons; //1=11
                } else {
                    cons = 0 * pv + cons;
                }
                pv = pv * 10;  //10

            }
            num = num - cons; //55-11
            if (num == 0) {
                System.out.print(cons);
            } else
                System.out.print(cons + "+");
        }
    }
}
