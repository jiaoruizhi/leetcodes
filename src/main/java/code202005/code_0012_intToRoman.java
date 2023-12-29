package code202005;

import java.util.HashMap;
import java.util.Scanner;




/*
*
* 将一个阿拉伯数字转化为  罗马数字
字符          数值
I             1
V             5
X             10
L             50
C             100
D             500
M             1000








* */
public class code_0012_intToRoman {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int get = sc.nextInt();
        System.out.println("输出结束");
        String roman = intToRoman(get);
        System.out.println(roman);

    }


    public  static String intToRoman(int num) {
        HashMap<Integer, String>  data= new HashMap<Integer, String>();
        data.put(1,"I");
        data.put(5,"V");
        data.put(10,"X");
        data.put(50,"L");
        data.put(100,"C");
        data.put(500,"D");
        data.put(1000,"M");

        StringBuilder ret = new StringBuilder();
        if(num>=2000) return "";
        int size =1000;
        while(num>0){
            int head = num /size;

            if(head>=0 && head <= 3){
                for (int i = 0; i < head; i++) {
                    ret.append(data.get(size));
                }
            }
            if(head >=4 && head <=5){
                for (int i = 0; i < (5-head); i++) {
                    ret.append(data.get(size));
                }
                ret.append(data.get(size*5));
            }
            if(head >=6 && head <=8){
                ret.append(data.get(size*5));
                for (int i = 0; i < (head-5); i++) {
                    ret.append(data.get(size));
                }
            }
            if(head >=9 && head <=9){
                for (int i = 0; i < (10-head); i++) {
                    ret.append(data.get(size));
                }
                ret.append(data.get(size*10));
            }
            num = num % size;
            size = size /10;

        }
        return ret.toString();
    }

}
