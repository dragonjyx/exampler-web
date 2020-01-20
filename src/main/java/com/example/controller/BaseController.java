package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author oyxl 10071355
 * @version 1.0
 * @description TODO
 * @date 2020/1/19 14:48
 * @blame 仓储开发组
 **/
@Controller
@RequestMapping("/")
public class BaseController {
    //日志
    private Logger logger = LoggerFactory.getLogger(BaseController.class);

    @Value("#{applicationConfig.appName}")
    private String applicationName;


    @RequestMapping(value="main",method=RequestMethod.GET)
    public String main(HttpServletRequest request, HttpServletResponse response, Model model){
        request.getSession();
        logger.info("applicationName:{}",applicationName);
        model.addAttribute("applicationName",applicationName);
        return "main";
    }

    @RequestMapping(value={"/","index"},method=RequestMethod.GET)
    public String index(){
        return "index";
    }


}
