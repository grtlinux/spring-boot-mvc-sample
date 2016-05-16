package com.htakemoto.controller.client

import com.htakemoto.resource.UserResource
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.ui.Model;

@Controller
class HomeController {

    @Autowired UserResource userResource

    @RequestMapping("/greeting")
    String greeting(Model model) {
        model.addAttribute("message", "Hello")
        model.addAttribute("users", userResource.getUsers())
        return "greeting"
    }

    @RequestMapping("/angular")
    String angular(Model model) {
        return "angular"
    }
}
