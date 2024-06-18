
                   //ANAGRAM NUMBE

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();
        long dig,res1=0,res2=0;
        while(num1!=0){  //142
            dig = num1 % 10;  //24
            res1=dig*(10^dig)+res1;//200+40000+10=40210
            num1=num1/10;
        }
        while(num2!=0){
            dig = num2 % 10;//421=12
            res2=dig*(10^dig)+res2;//10+200+40000=40210
            num2=num2/10;
        }
        if (res1==res2){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}

