package com.vpt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dialo on 13.08.2017.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home(){
        return "WEB-INF/pages/test";
    }
}
