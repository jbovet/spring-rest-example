package cl.zbsys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("cl.zbsys")
public class ZbsysApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZbsysApplication.class, args);
    }
}
