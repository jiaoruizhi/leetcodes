package code202005;

import java.util.*;

public class code_0155_MinStack {


  class MinStack {
    Stack<Integer> list;
    Stack<Integer> min;

    public MinStack() {
      list = new Stack<Integer>();
      min = new Stack<Integer>();
    }

    public void push(int x) {
      list.add(x);
      if (min.size() == 0) {
        min.push(x);
      } else if (min.peek().intValue() >= x) {
        min.push(x);
      }

    }

    public void pop() {
      int a = list.pop().intValue();
      if (a == min.peek().intValue()) {
        min.pop();
      }
    }

    public int top() {
      return list.peek().intValue();

    }

    public int getMin() {
      return min.peek().intValue();

    }
  }
}


