package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String index() {
        return "Chúc Mừng Năm Mới222dsadsadsadsddda22111 2024";
    }

}
