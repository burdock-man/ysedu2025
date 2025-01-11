package kr.or.ysedu.c702;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping ("/hello")
    public String hello() {
        return "hello";
        // hello.html이 없으면 그냥 문자열 hello 출력.
    }
}
