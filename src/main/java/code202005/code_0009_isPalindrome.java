package code202005;

import java.util.Scanner;

public class code_0009_isPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int get = sc.nextInt();
        System.out.println(isPalindrome(get));
    }

    private static boolean isPalindrome(int get) {
        if(get<0)return false;
        if(get<10)return true;
        char []  one = String.valueOf(get).toCharArray();
        int l=0 , r=one.length-1;
        while(l<=r){
            if(one[l] != one[r])return false;
            l++;r--;
        }
        return true;
    }
}
