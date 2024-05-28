package meeting;

/*
*

*
* */
public class meeting_20240527_1 {
  public static void main(String[] args) {
    meeting_20240527_1 body = new meeting_20240527_1();

    body.action();
  }

  //
  public void action() {
    new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("a");
      }
    }).start();

    new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("b");
      }
    }).start();

    new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("c");
      }
    }).start();

  }

}

