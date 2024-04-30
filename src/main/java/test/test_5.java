package test;

public class test_5 {
  public static void main(String[] args) {
    test_4 body = new test_4();

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




