package code202404_2;


/*
给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。

示例:

输入: 1 2 3 4 5
输出: 2 1 4 3 5
*
*
* */
import static utils.utils.listBuild;
import static utils.utils.printLinkedList;

import utils.dto.ListNode;

public class code_0024_swapPairs {
  public static void main(String[] args) {
    code_0024_swapPairs body = new code_0024_swapPairs();

    //
    ListNode head = listBuild();

    ListNode result = body.swapPairs(head);
    printLinkedList(result);
  }

  public ListNode swapPairs(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode left = head, right = head.next, result = new ListNode(-1, head), last = result;
    while (left != null && right != null) {
      ListNode nextLeft = right.next;

      last.next = right;
      left.next = right.next;
      right.next = left;

      last = left;
      left = nextLeft;
      right = nextLeft != null ? nextLeft.next : null;
    }
    return result.next;
  }
}
