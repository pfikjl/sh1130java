package com.atguigu.boot;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootDemo4ApplicationTests {

    Logger logger = LoggerFactory.getLogger(SpringbootDemo4Application.class);

    @Test
    void contextLoads() {
        logger.debug("debug级别日志");
        logger.info("info级别日志");
        logger.warn("warn级别日志");
        logger.error("error级别日志");
    }

}
