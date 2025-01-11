package kr.or.ysedu.c702;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageController {

//    MessageService messageService = new MessageService();
    @Autowired // 의존성을 주입
    private MessageService messageService;
    // 접근제어자 안적으면 default로 설정됨.

    // /message/1998
    @GetMapping ("/message/{no}")
    @ResponseBody
    public String message(@PathVariable("no") int v) {
        // int no = 1998
        // return "message";

        return messageService.getMessage(v);
    }

}
