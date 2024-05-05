package test.duotai;

/**
 * @author jiaoruizhi
 * @date
 * @apiNote
 */
public class Demo1 {
  public static void main(String[] args) {
    Animal a = new Cat();
    Cat b = new Cat();
    a.eat();
    a.sleep();
    a.run();
    System.out.println(a.num);
    System.out.println(a.age);

    System.out.println("--------------------------------");
    b.eat();
    b.sleep();
    b.run();
    System.out.println(b.num);
    System.out.println(b.age);
  }
}
