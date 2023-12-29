package code202005;


/*
* 反转一个单链表。

示例:

输入: 1->2->3->4->5->NULL
输出: 5->4->3->2->1->NULL
*
*
* */
import static utils.utils.listBuild;

import utils.dto.ListNode;

public class code_0206_reverseList {
  public static void main(String[] args) {
    ListNode get = listBuild();
    ListNode ret = reverseList(get);
    while (ret != null) {
      System.out.print(ret.val + "   ");
      ret = ret.next;
    }
  }

  public static ListNode reverseList(ListNode head) {
    if (head == null)
      return null;
    ListNode pre = null, aft = null, headnode = head;
    while (headnode.next != null) {
      pre = headnode.next;
      headnode.next = aft;
      aft = headnode;
      headnode = pre;
    }
    headnode.next = aft;
    return headnode;
  }
}
