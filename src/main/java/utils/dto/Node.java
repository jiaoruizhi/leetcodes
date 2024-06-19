package utils.dto;

public class Node {
  public int value;
  public int x;
  public int y;
  public Node next;

  public Node() {}

  public Node(int _val) {
    value = _val;
  }

  public Node(int _x, int _y) {
    x = _x;
    y = _y;
  }


  public Node(int _val, int _x, int _y) {
    value = _val;
    x = _x;
    y = _y;
  }

  public boolean equals(Node obj) {
    return x == obj.x && y == obj.y;
  }
}
