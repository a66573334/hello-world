package com.mark.helloworld.api
import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloApi {

    @GetMapping
    public String hello() {
        return "Hello, world!";
    }
}