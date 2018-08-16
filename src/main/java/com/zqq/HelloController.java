package com.zqq;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
@Api(description = "测试api")
@Controller
public class HelloController {

   @Autowired
   private Girl girl;

    @ApiOperation(value="输出hello", notes="")
    @RequestMapping( value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "int",paramType = "query")
    public String Hello(@RequestParam(value="id",defaultValue = "0",required = true) Integer id) {

        return "id="+id;
    }

    @ApiOperation(value="跳转页面", notes="")
    @RequestMapping( value = "/test", method = RequestMethod.GET)
    public ModelAndView getHtml() {
        ModelAndView man = new ModelAndView("test");
        return man;
    }
}
