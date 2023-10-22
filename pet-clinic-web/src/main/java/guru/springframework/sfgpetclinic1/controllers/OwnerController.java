package guru.springframework.sfgpetclinic1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

        @RequestMapping({"","index","index.html"})
        public String listVets(){

            return "owners/index";
        }
}
