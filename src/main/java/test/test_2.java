package test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class test_2 {
  public static void main(String[] args) {

    HashMap<String, Object> map = new HashMap<>();
    
    Queue<Integer> cache = new LinkedList<Integer>();

    Queue<Integer> mid = new LinkedList<Integer>();

    mid.add(1);
    mid.add(2);
    mid.add(3);

    System.out.println(mid);

    int out = mid.poll();
    System.out.println(mid);
    System.out.println(out);


  }

}




