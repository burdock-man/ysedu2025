package kr.or.ysedu.c702;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/menu/{no}")
    public String menu(@PathVariable("no") int no) {
        return menuService.getMenu(no);
    }



}
