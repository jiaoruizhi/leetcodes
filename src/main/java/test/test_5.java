package test;

import java.time.LocalDateTime;

public class test_5 {
  public static void main(String[] args) {
    test_5 body = new test_5();

    LocalDateTime now = LocalDateTime.now();
    now = now.minusSeconds(now.getSecond());
    System.out.println(now);


  }

  public int try_catch_return() {
    try {
      return 0;
    } finally {
      return 1;
    }
  }

}




