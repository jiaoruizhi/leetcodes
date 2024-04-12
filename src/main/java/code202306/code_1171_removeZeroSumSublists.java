package code202306;


import static utils.arrayUtils.getIntArray;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
*

给你一个链表的头节点 head，请你编写代码，反复删去链表中由 总和 值为 0 的连续节点组成的序列，直到不存在这样的序列为止。

删除完毕后，请你返回最终结果链表的头节点。



你可以返回任何满足题目要求的答案。

（注意，下面示例中的所有序列，都是对 ListNode 对象序列化的表示。）

* */
public class code_1171_removeZeroSumSublists {
  public static void main(String[] args) {
    code_1171_removeZeroSumSublists body = new code_1171_removeZeroSumSublists();

    // 1 2 -3 3 1
    Scanner sc = new Scanner(System.in);

    int[] nums = getIntArray(sc, null);

    // 123124123124123124123

    ListNode head = body.buildLink(nums);
    System.out.println(body.removeZeroSumSublists(head));
  }

  public ListNode buildLink(int[] nums) {
    ListNode head = new ListNode();

    ListNode current = head;
    ListNode last = null;

    for (int i : nums) {
      if (last != null) {
        last.next = current;
      }
      current.val = i;
      last = current;
      current = new ListNode();
    }
    return head;
  }


  public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  public ListNode removeZeroSumSublists(ListNode head) {

    ListNode dummy = new ListNode(0);
    dummy.next = head;

    Map<Integer, ListNode> map = new HashMap<>();

    // 首次遍历建立 节点处链表和<->节点 哈希表
    // 若同一和出现多次会覆盖，即记录该sum出现的最后一次节点
    int sum = 0;
    for (ListNode d = dummy; d != null; d = d.next) {
      sum += d.val;
      map.put(sum, d);
    }

    // 第二遍遍历 若当前节点处sum在下一处出现了则表明两结点之间所有节点和为0 直接删除区间所有节点
    sum = 0;
    for (ListNode d = dummy; d != null; d = d.next) {
      sum += d.val;
      d.next = map.get(sum).next;
    }

    return dummy.next;

  }

}

