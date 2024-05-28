package meeting;

/*
 *

 *
 * */
public class meeting_20240527_2 {
  int count = 10, a = 0, b = 0, c = 0;

  public static void main(String[] args) {
    meeting_20240527_2 body = new meeting_20240527_2();

    body.action();
  }

  //
  public void action() {
    new Thread(new Runnable() {
      @Override public void run() {
        while (count > 0) {
          a++;
          System.out.println("a: " + count--);
        }
      }
    }).start();

    new Thread(new Runnable() {
      @Override public void run() {
        while (count > 0) {
          b++;
          System.out.println("b: " + count--);
        }
      }
    }).start();

    new Thread(new Runnable() {
      @Override public void run() {
        while (count > 0) {
          c++;
          System.out.println("c: " + count--);
        }
      }
    }).start();
  }

}

