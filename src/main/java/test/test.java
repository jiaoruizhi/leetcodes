package test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class test {
  public static void main(String[] args) {

    Thread t = new Thread() {
      public void run() {
        pong();
      }
    };
    t.run();
    System.out.print("ping");
  }

  static void pong() {
    System.out.print("pong");
  }

}




