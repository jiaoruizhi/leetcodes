package utils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import org.w3c.dom.Node;

import utils.dto.ListNode;
import utils.dto.TreeNode;

public class utils {
  public static int[] getIntArray(Scanner scanner, String split) {
    split = split == null ? " " : split;

    Scanner sc = scanner != null ? scanner : new Scanner(System.in);
    String line = sc.nextLine();
    String[] str = line.split(split);
    int[] ret = new int[str.length];
    for (int i = 0; i < ret.length; i++) {
      int a = Integer.parseInt(str[i]);
      ret[i] = a;
    }
    return ret;
  }

  public static List<Integer> getIntList(Scanner scanner, String split) {
    split = split == null ? " " : split;

    Scanner sc = scanner != null ? scanner : new Scanner(System.in);
    String line = sc.nextLine();
    String[] strs = line.split(split);
    List<Integer> res = new ArrayList<>();

    for (String s : strs) {
      res.add(Integer.parseInt(s));
    }

    return res;
  }

  public static String[] getStringArray(Scanner scanner, String split) {
    split = split == null ? " " : split;

    Scanner sc = scanner != null ? scanner : new Scanner(System.in);
    String line = sc.nextLine();
    String[] str = line.split(split);
    return str;
  }

  public static int[][] getIntDoubleArray() {
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int columns = sc.nextInt();

    int[][] data = new int[rows][columns];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        int cache = sc.nextInt();
        data[i][j] = cache;
      }
    }

    return data;
  }


  public static TreeNode getTree() {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    String[] str = line.split(",");

    List<TreeNode> list = new ArrayList<TreeNode>();
    for (int i = 0; i < str.length; i++) {
      String st = str[i];
      TreeNode node = "null".equals(st) ? null : new TreeNode(Integer.parseInt(st));
      list.add(node);
    }
    // 构建二叉树
    if (list.size() > 0) {
      for (int i = 0; i < str.length / 2 - 1; i++) {       // i表示的是根节点的索引，从0开始
        if (list.get(2 * i + 1) != null) {
          list.get(i).left = list.get(2 * i + 1);
        }
        if (list.get(2 * i + 2) != null) {
          list.get(i).right = list.get(2 * i + 2);
        }
      }
      int lastIndex = str.length / 2 - 1;
      list.get(lastIndex).left = list.get(lastIndex * 2 + 1);
      if (str.length % 2 == 1) {
        list.get(lastIndex).right = list.get(lastIndex * 2 + 2);
      }
    }

    return list.get(0);
  }

  public static ListNode listBuild() {
    return listBuild(" ");
  }

  public static ListNode listBuild(String split) {
    Scanner sc = new Scanner(System.in);
    String get = sc.nextLine();
    String[] ss = get.split(split);
    ListNode head = new ListNode(0);
    ListNode current = head;
    for (int i = 0; i < ss.length; i++) {
      ListNode now = new ListNode(Integer.valueOf(ss[i]));
      current.next = now;
      current = now;
    }
    return head.next;
  }

  public static void printLinkedList(ListNode head) {
    ListNode node = head;

    while (true) {
      if (node == null) break;

      System.out.print(node.val);
      if (node.next != null) {
        System.out.print("->");
      }
      node = node.next;
    }
    System.out.println();
  }
}
