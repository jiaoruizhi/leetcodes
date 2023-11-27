package utils;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {
  @Override
  public int compare(Integer o1, Integer o2) {
    //如果n1小于n2，我们就返回正值，如果n1大于n2我们就返回负值，
    //这样颠倒一下，就可以实现反向排序了
    if (o1 < o2) {
      return 1;
    } else if (o1 > o2) {
      return -1;
    } else {
      return 0;
    }
  }
}
