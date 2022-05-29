package study.thymeleafbasic.basic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/basic")
public class BasicController {

    @GetMapping("/text-basic")
    public String textBasic(Model model) {
        model.addAttribute("data", "Hello thymeleaf!");
        model.addAttribute("escape", "<b>escape</b>");
        model.addAttribute("unescape", "<b>unescape</b>");
        return "/basic/text-basic";
    }
}
