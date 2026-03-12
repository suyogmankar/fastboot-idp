package io.platform.operator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "io.platform")
public class FastbootOperatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(FastbootOperatorApplication.class, args);
    }
}