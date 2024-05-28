package leetcodes.hard;

import static utils.utils.listBuild;

import java.util.Scanner;

import utils.dto.ListNode;

public class code_0025_reverseKGroup {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ListNode get = listBuild();
    int number = sc.nextInt();
    ListNode ret = reverseKGroup(get, number);
  }



  public static ListNode reverseKGroup(ListNode head, int k) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;

    ListNode pre = dummy;
    ListNode end = dummy;

    while (end.next != null) {
      for (int i = 0; i < k && end != null; i++)
        end = end.next;
      if (end == null)
        break;
      ListNode start = pre.next;
      ListNode next = end.next;
      end.next = null;
      pre.next = reverse(start);
      start.next = next;
      pre = start;

      end = pre;
    }
    return dummy.next;
  }

  private static ListNode reverse(ListNode head) {
    ListNode pre = null;
    ListNode curr = head;
    while (curr != null) {
      ListNode next = curr.next;
      curr.next = pre;
      pre = curr;
      curr = next;
    }
    return pre;
  }



}
