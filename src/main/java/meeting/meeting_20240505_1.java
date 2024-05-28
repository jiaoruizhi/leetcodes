package meeting;

import static utils.arrayUtils.getIntArray;

import java.util.Arrays;
import java.util.Scanner;

/*
*

*
* */
public class meeting_20240505_1 {
  public static void main(String[] args) {
    meeting_20240505_1 body = new meeting_20240505_1();
    Scanner sc = new Scanner(System.in);

    // 3 3 8 7 10 15
    int[] logs = getIntArray(sc, " ");

    // 40
    int limit = sc.nextInt();
    System.out.println(body.logLimit(logs, limit));
  }

  //
  public int logLimit(int[] logs, int limit) {
    int all = Arrays.stream(logs).sum();
    if (all <= limit) {
      return -1;
    }
    Arrays.sort(logs);

    int minus = all - limit;
    int unitLimit = logs[logs.length - 1], cache = 0;

    while (true) {
      for (int data : logs) {
        cache += data > unitLimit ? data - unitLimit : 0;
      }
      if (cache >= minus) {
        return unitLimit;
      }
      cache = 0;
      unitLimit--;
    }
  }

}

