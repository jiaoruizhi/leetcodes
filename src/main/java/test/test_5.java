package test;

public class test_5 {
  public static void main(String[] args) {
    test_5 body = new test_5();

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




