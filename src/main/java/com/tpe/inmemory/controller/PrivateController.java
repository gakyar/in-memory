package com.tpe.inmemory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mahmut")
public class PrivateController {
    @GetMapping
    public String helloWorldPrivate() {
        return "Hello world from private endpoint";
    }


    @GetMapping("/user")
    public String helloWorldUserPrivate() {
        return "Hello world from user private endpoint";

    }

    @GetMapping("/admin")
    public String helloWorldAdminPrivate() {
        return "Hello world from admin private endpoint";

    }

}
