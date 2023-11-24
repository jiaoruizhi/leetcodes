package leet202005;

import java.util.Scanner;

public class code_0002_addTwoNumbers {
    public static void main(String[] args) {
        ListNode one = getnumber();
        ListNode two = getnumber();
        System.out.println("输出结束");
        ListNode get = addTwoNumbers(one,two);
        while(get!=null){
            System.out.println(get.val);
            get=get.next;
        }

    }

    private static ListNode getnumber() {
        ListNode ret=null;
        ListNode now=null;
        Scanner sc = new Scanner(System.in);
        int get = sc.nextInt();
        String gets = String.valueOf(get);
        char[] array = gets.toCharArray();
        for(int i = array.length-1 ; i>=0;i--){
            int a = array[i]-'0';
            if(ret==null){
                ret = new ListNode(a);
                now=ret;
            }else{
                now.next = new ListNode(a);
                now=now.next;
            }
        }
        return ret;
    }


    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ret = new ListNode(0);
        ListNode now = ret;
        int up=0;
        int x,y;

        while(l1!=null || l2!=null){
            x = l1!=null ? l1.val:0;
            y = l2!=null ? l2.val:0;
        int a = x+y+up; up=0;
        if(l1!=null){l1=l1.next;}
        if(l2!=null){l2=l2.next;}

        if(a>=10){
            up=1;
            a -=10;
        }
        now.next=new ListNode(a);
        now=now.next;
        }
        if (up != 0) {
            now.next=new ListNode(up);
        }
        return ret.next;
    }
}
