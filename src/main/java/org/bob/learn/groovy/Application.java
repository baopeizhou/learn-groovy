package org.bob.learn.groovy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * learn-groovy应用启动类
 */
@Slf4j
@SpringBootApplication
public class Application {
    public static void main(final String[] args) {
        log.info("learn-groovy应用启动开始!");
        SpringApplication.run(Application.class, args);
        log.info("learn-groovy应用启动成功!");
    }
}
