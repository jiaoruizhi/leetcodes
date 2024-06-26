package leetcodes.code202005;


import java.util.Scanner;

/*
* 请你来实现一个 atoi 函数，使其能将字符串转换成整数。

首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。接下来的转化规则如下：

    如果第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字字符组合起来，形成一个有符号整数。
    假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成一个整数。
    该字符串在有效的整数部分之后也可能会存在多余的字符，那么这些字符可以被忽略，它们对函数不应该造成影响。

注意：假如该字符串中的第一个非空格字符不是一个有效整数字符、
字符串为空或字符串仅包含空白字符时，则你的函数不需要进行转换，即无法进行有效转换。

在任何情况下，若函数不能进行有效的转换时，请返回 0 。


*
* */
public class code_0008_myAtoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String get = sc.nextLine();
        int number = myAtoi(get);
        System.out.println(number);
    }

    public static int myAtoi(String str) {
        str = str.trim();
        long ret = 0;
        int head =1;
        char [] chs = str.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            char ch = chs[i];

            if (i == 0) {
                if(ch == '-'){head=-1;continue;}
                if ( ch!='-' && (ch<'0'||ch>'9')){
                    return 0;
                }
            }else{
                if (ch<'0'||ch>'9'){
                    break;
                }
            }
            ret = ret*10 + Integer.valueOf(ch-'0');
            System.out.println(ret);
            if(ret>Integer.MAX_VALUE || ret<Integer.MIN_VALUE)break;
        }
        if((int)ret != ret){
            System.out.println("溢出" + head);
            if(head==-1){
                ret = Integer.MIN_VALUE;
            }
            else{ret=Integer.MAX_VALUE;}
        }else{
            ret *= head;
        }
        return  (int)ret;
        }

    }

 /*   // "2147483648"

"18446744073709551617"
*/
