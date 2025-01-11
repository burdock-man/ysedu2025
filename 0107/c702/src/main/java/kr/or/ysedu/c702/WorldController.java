package kr.or.ysedu.c702;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WorldController {

    @Autowired
    private WorldService worldService;

    @GetMapping ("/world/{name}")
    @ResponseBody
    public String World(@PathVariable("name") String n) {
        return worldService.world(n);
    }

}
