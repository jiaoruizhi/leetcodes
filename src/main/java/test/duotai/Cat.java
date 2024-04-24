package test.duotai;

/**
 * @author jiaoruizhi
 * @date
 * @apiNote
 */
public class Cat extends Animal {
  int num = 80;
  static int age = 90;

  String name = "tom cat";

  public void eat() {
    System.out.println("Cat eat");
  }

  public static void sleep() {
    System.out.println("Cat sleep");
  }

  public void run() {
    System.out.println("Cat run");
  }
}
