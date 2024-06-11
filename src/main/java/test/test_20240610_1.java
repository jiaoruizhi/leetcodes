package test;

public class test_20240610_1 {
  public static void main(String[] args) {
    test_20240610_1 body = new test_20240610_1();

    System.out.println(body.try_catch_return());

  }

  public int try_catch_return() {
    try {
      return 0;
    } finally {
      return 1;
    }
  }

}




