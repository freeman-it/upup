package com.it.reee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @project: docker-demo
 * @package: com.it.reee.controller
 * @author: fandy
 * @date: 2024/10/10 14:02
 * @description: TODO
 * @version: 1.0
 * @company: 中电信翼康科技有限公司
 */

@RestController
public class HelloController {

    // 向浏览器输入hello
    @GetMapping("/hello")
    public String hello() {
        return "Hello, Docker!";
    }


}
