package com.zqq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "ftl")
public class FreemakerController {

    @Autowired
    private Girl girl;
    @RequestMapping(value = "index", method = RequestMethod.GET)
    public ModelAndView index(ModelMap mm) {
        ModelAndView mav = new ModelAndView("index/index");
        mav.addObject("girl",girl);
        return mav;
    }

    @RequestMapping(value = "center", method = RequestMethod.GET)
    public String center() {
        return "center.ftl";
    }
}
