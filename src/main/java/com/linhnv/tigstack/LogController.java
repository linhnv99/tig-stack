package com.linhnv.tigstack;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logs")
public class LogController {

    @GetMapping
    public String read() throws InterruptedException {
        return "OK";
    }

}
