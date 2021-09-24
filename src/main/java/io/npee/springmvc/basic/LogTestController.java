package io.npee.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

    @GetMapping("/log-test")
    public String logTest() {

        String name = "Spring";
        log.trace("trace = {}", name);
        log.info("info = {}", name);
        // log.info("info = " + name); // 덧셈 연산 사용하지 않기
        log.debug("debug = {}", name);
        log.warn("warn = {}", name);
        log.error("error = {}", name);

        return "OK";
    }
}
