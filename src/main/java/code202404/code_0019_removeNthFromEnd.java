package code202404;


/*
* 反转一个单链表。

示例:

输入: 1->2->3->4->5->NULL
输出: 5->4->3->2->1->NULL
*
*
* */
import static utils.utils.listBuild;
import static utils.utils.printLinkedList;

import java.util.Scanner;

import utils.dto.ListNode;

public class code_0019_removeNthFromEnd {
  public static void main(String[] args) {
    code_0019_removeNthFromEnd body = new code_0019_removeNthFromEnd();
    Scanner sc = new Scanner(System.in);

    // 1 2 3 4 5
    ListNode get = listBuild();

    // 2
    int n = sc.nextInt();

    ListNode after = body.removeNthFromEnd(get, n);

    printLinkedList(after);

  }

  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode result = new ListNode(-1, head);
    ListNode left = result;
    ListNode right = result;

    for (int i = 0; i < n; i++) {
      right = right.next;
    }

    while (right != null && right.next != null) {
      left = left.next;
      right = right.next;
    }
    left.next = left.next.next;

    return result.next;
  }

}
