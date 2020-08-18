package com.sue.colletor.api;

import com.sue.colletor.util.InputMDC;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sue
 * @date 2020/8/18 11:13
 */

@RestController
@Slf4j
public class IndexController {
    @RequestMapping("/index")
    public String index(){

        InputMDC.putMDC();
        log.info("info");
        log.warn("warn");
        log.error("error");

        return "idx";
    }
}
