package controleurs;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DefautControleur {
    @RequestMapping("/")
    public String index() {
        return ("index");
    }
}
