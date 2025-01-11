package kr.or.burdockman.test1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping ("/home")
    public String home() {
        return "home";
    }

    @GetMapping ("/news")
    public String news() {
        return "news/news";
    }

    @GetMapping ("/about")
    public String about() { return "common/about"; }

    @GetMapping ("/contect")
    public String contect() { return "common/contect"; }
}
