package code202404;


/*
给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。

你应当 保留 两个分区中每个节点的初始相对位置。
* */
import static utils.utils.listBuild;
import static utils.utils.printLinkedList;

import java.util.Scanner;

import utils.dto.ListNode;

public class code_0086_partition {
  public static void main(String[] args) {
    code_0086_partition body = new code_0086_partition();
    Scanner sc = new Scanner(System.in);

    // 1 4 3 2 5 2
    ListNode get = listBuild();

    // 3
    int n = sc.nextInt();

    ListNode after = body.partition(get, n);
    printLinkedList(after);
  }

  public ListNode partition(ListNode head, int n) {
    ListNode current = head;
    ListNode left = new ListNode(-1);
    ListNode leftHead = left;
    ListNode right = new ListNode(-1);
    ListNode rightHead = right;

    while (current != null) {
      ListNode newNode = new ListNode(current.val);
      System.out.println(current.val);

      if (current.val < n) {
        left.next = newNode;
        left = left.next;
      } else {
        right.next = newNode;
        right = right.next;
      }
      current = current.next;
    }
    left.next = rightHead.next;
    return leftHead.next;
  }

}
