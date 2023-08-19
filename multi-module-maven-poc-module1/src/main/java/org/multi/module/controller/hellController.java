package org.multi.module.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class hellController {

    @GetMapping("/module1/hello")
    public ResponseEntity<?> hello() {
        log.info("module1 hello");
        return ResponseEntity.ok("module1 Hello World!");
    }
}
