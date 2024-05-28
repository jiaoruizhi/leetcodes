package meeting.Huawei;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CopyFiles {
  public static int total_size = 1474560;

  public static int page_size = 512;

  public static int total_page = total_size / page_size;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Integer n = sc.nextInt();

    //3
    //737270
    //737272
    //737288
    // 3 737270 737272 737288

    //6
    //400000
    //200000
    //200000
    //200000
    //400000
    //400000
    // 6 400000 200000 200000 200000 400000 400000

    Integer[] files = new Integer[n];
    for (int i = 0; i < n; i++) {
      files[i] = sc.nextInt();
    }
    Arrays.sort(files, Comparator.reverseOrder());
    List<Integer> items = Arrays.asList(files);

    System.out.println(getResult(items, total_page));
  }

  public static int getResult(List<Integer> files, int pageSize) {
    if (files.size() == 0 || pageSize < 0) {
      return 0;
    }

    if (files.size() == 1) {
      Integer item = files.get(0);
      Integer pageNumber = (int)Math.ceil((double)item / 512);
      return pageNumber > pageSize ? 0 : item;
    }

    Integer first = files.get(0);
    Integer firstPage = (int)Math.ceil((double)first / 512);

    List<Integer> nextList = files.subList(1, files.size());
    int putFirst = pageSize > firstPage ? first + getResult(nextList, pageSize - firstPage) : 0;
    int putNotFirst = getResult(nextList, pageSize);

    return Math.max(
      putFirst,
      putNotFirst
    );
  }

}
