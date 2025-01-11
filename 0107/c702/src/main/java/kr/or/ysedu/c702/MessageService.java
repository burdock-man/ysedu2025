package kr.or.ysedu.c702;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public String getMessage(int id) {
        return "your number is beautiful : " + id;
    }

}
