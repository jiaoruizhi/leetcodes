package leet202005;

import java.util.Scanner;

public class code_0007_NumberReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ret = reverse(x);
        System.out.println(ret);
    }

    public static  int reverse(int x) {
        long res = 0;
        while(x!=0){
            res = res*10+x%10;
            x=x/10;
        }
        int ret = (int)res;
        return ret==res ?  ret:0;

    }
}
//1534236469