package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloWorldController {
    // Write a mapping for GET /hello
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/")
    public String index() {
        return "Chúc Mừng Năm Mới222dsadsadsadsddda22111 2024";
    }

}
