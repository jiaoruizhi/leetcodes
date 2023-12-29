package code202005;

import java.util.*;

/*
*
将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。

比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：

L   C   I   R
E T O E S I I G
E   D   H   N


*
*
* */
public class code_0006_StringZconvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String before  = sc.nextLine();
        int numRows = sc.nextInt();
        System.out.println("输出结束");

        String after = convert(before,numRows);
        System.out.println(after);

    }

    public static  String convert(String s, int numRows) {
        if(s.length()<=numRows || numRows<=1)return s;
        StringBuilder [] mys = new StringBuilder[numRows];
        for (int i = 0; i <  numRows; i++) {
            mys[i]=new StringBuilder();
        }
        char [] chars = s.toCharArray();
        String space = " ";
        int xindex=0,yindex=0;

        int c_index=0;
        while(c_index<chars.length){
            char ch = chars[c_index];
            boolean just = (xindex%(numRows-1)==0);
            //System.out.println("xindex    "+xindex+"    yindex  " + yindex);
            if(just){
                mys[yindex].append(ch);
                c_index++;
                yindex++;
                if(yindex==numRows){
                    yindex=0;
                    xindex++;
                }
                continue;
            }
            boolean lisan;
            lisan = (((xindex%(numRows-1))+yindex)==numRows-1);
            if(lisan){
                mys[yindex].append(ch);
                c_index++;
            }
            yindex++;
            if(yindex==numRows){
                yindex=0;
                xindex++;
            }
        }
        StringBuilder together = new StringBuilder();
        for ( StringBuilder a:mys ) {
            System.out.println(a.toString());
            together.append(a);
        }
        return together.toString();
    }
}


//


/*

123456789
3

PAYPALISHIRING
5



*/
