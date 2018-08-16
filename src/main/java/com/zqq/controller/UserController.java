package com.zqq.controller;

import com.zqq.Girl;
import org.junit.runner.RunWith;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Transactional(readOnly = true)
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<Girl> query() {
        List<Girl> list = new ArrayList<>();
        list.add(new Girl());
        return list;
    }

}
