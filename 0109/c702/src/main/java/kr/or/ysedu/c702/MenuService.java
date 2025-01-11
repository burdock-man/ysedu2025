package kr.or.ysedu.c702;

import org.springframework.stereotype.Service;

@Service
public class MenuService {

    public String getMenu(int no) {

        String result = "404";

        if (no == 1) {
            result = "about";
        } else if (no == 2) {
            result = "contact";
        } else if (no == 3) {
            result = "info";
        }

        return result;
    }

}
