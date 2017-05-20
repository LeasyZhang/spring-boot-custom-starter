package net.leasy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by leasy on 17/5/19.
 */
@SpringBootApplication
public class MyInfoApplication implements CommandLineRunner {

    @Autowired
    private MyInfo myInfo;

    @Override
    public void run(String... args) throws Exception{
        String message = myInfo.print();
        System.out.println(message);
    }

    public static void main(String[] args) {
        SpringApplication.run(MyInfoApplication.class, args);
    }
}
