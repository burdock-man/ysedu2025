package kr.or.ysedu.test2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping ("/hello")
    public String hello() {
        return "hello";
    }

    @ResponseBody
    @GetMapping ("/world")
    public String world() {
        return "<!doctype html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\"\n" +
                "          content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n" +
                "    <title>Document</title>\n" +
                "    <style>\n" +
                "        body {\n" +
                "            background: teal;\n" +
                "            color: wheat;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1>World!</h1>\n" +
                "    <a href='/hello'>Hello 바로가기</a>\n" +
                "</body>\n" +
                "</html>";
    }
}
