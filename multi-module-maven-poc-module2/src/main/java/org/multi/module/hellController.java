package org.multi.module;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellController {

    @GetMapping("/module2/hello")
    public String hello() {
        return "module2 Hello World!";
    }
}
