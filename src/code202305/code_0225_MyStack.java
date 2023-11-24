package code202305;

import java.util.LinkedList;
import java.util.Queue;

public class code_0225_MyStack {
  /*
   *
   *
   * 用队列实现栈
   *
   * */
  public static void main(String[] args) {
    MyStack ms = new MyStack(){{ push(1); push(2);}};
    System.out.println(ms.top());
    System.out.println(ms.pop());
    System.out.println(ms.pop());
    System.out.println(ms.empty());

  }

  public static class MyStack {
    Queue<Integer> que;
    int length;
    int last;

    public MyStack() {
      int last;
      que = new LinkedList<Integer>();
      length = 0;
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
      last = x;
      que.add(x);
      length++;
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
      if (length == 0)
        return 0;
      Queue<Integer> mid = new LinkedList<Integer>();
      int hlast = 0;
      for (int i = 0; i < length - 1; i++) {
        int a = que.poll();
        hlast = a;
        mid.add(a);
      }
      int ret = last;
      que = mid;
      length--;
      last = hlast;
      return ret;
    }

    /**
     * Get the top element.
     */
    public int top() {
      return last;

    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
      return length == 0;

    }
  }



}
