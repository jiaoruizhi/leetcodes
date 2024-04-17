package test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test_3 {
  public static void main(String[] args) {

    Stream.of("Howareyou?","JavaStream","Hello","Welcome","Hi","aloha")
      .filter(text->text.startsWith("H"))
      .map(text->text.substring(2))
      .distinct()
      .sorted()
      .collect(Collectors.toList());
  }

}




