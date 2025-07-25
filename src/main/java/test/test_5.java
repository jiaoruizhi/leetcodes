package test;

import java.time.LocalDateTime;

public class test_5 {
    public static void main(String[] args) {
        test_5 body = new test_5();

        System.out.println(body.try_catch_return());
        LocalDateTime now = LocalDateTime.now();
        now = now.minusSeconds(now.getSecond());
        System.out.println(now);


        Long id = 684001577L;
        System.out.println(id.intValue());

    }

    public int try_catch_return() {
        try {
            return 0;
        } finally {
            return 1;
        }
    }

}




