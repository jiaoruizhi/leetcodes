package code202404;


/*
将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
*
*
* */
import static utils.utils.listBuild;
import static utils.utils.printLinkedList;

import java.util.Scanner;

import utils.dto.ListNode;

public class code_0021_mergeTwoLists {
  public static void main(String[] args) {
    code_0021_mergeTwoLists body = new code_0021_mergeTwoLists();
    Scanner sc = new Scanner(System.in);

    // 1 3 5
    ListNode head1 = listBuild();

    // 1 2 4
    ListNode head2 = listBuild();


    ListNode newNode = body.mergeTwoLists(head1, head2);

    printLinkedList(newNode);

  }

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode result = new ListNode(-1);
    ListNode index = result;
    ListNode left = list1;
    ListNode right = list2;

    while (left != null || right != null) {
      if (left == null) {
        index.next = right;
        index = index.next;
        right = right.next;
        continue;
      }
      if (right == null) {
        index.next = left;
        index = index.next;
        left = left.next;
        continue;
      }
      if (right.val <= left.val) {
        index.next = right;
        index = index.next;
        right = right.next;
        continue;
      }
      if (left.val < right.val) {
        index.next = left;
        index = index.next;
        left = left.next;
      }
    }
    return result.next;
  }

}
