package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class tesst {
    @GetMapping("/")
    public String index() {
        return "Chúc Mừng Năm Mới222dsadsaddadsadaffffffsdádsddadsasadsddda22111 2024";
    }

}