package kr.or.ysedu.c702;

import org.springframework.stereotype.Service;

@Service
public class WorldService {

    public String world(String name) {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>반갑습니다 "+ name +"님.</title>\n" +
                "    <style>\n" +
                "        body {\n" +
                "            background: teal;\n" +
                "        }\n" +
                "        h1 {\n" +
                "            color: wheat;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1>"+ name +"님, 안녕하세요?</h1>\n" +
                "</body>\n" +
                "</html>";
    }

}
