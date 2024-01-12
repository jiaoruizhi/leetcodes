package ins_test;

import com.github.instagram4j.instagram4j.IGClient;
import com.github.instagram4j.instagram4j.exceptions.IGLoginException;

public class ins_2 {
  public static void main(String[] args) throws IGLoginException {
    IGClient client = IGClient.builder()
      .username("jiaoruizhi")
      .password("jrz610133JRZ")
      .login();

    String userName = client.getSelfProfile().getUsername();

    System.out.println(userName);

  }


}




