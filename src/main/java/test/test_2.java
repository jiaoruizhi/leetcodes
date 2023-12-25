package test;

import java.util.LinkedList;
import java.util.Queue;

public class test_2 {
  public static void main(String[] args) {

    Queue<Integer> mid = new LinkedList<Integer>();

    mid.add(1);
    mid.add(2);
    mid.add(3);

    System.out.println(mid);

    mid.poll();
    System.out.println(mid);


  }

}




