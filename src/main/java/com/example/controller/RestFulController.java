package com.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.controller.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author oyxl 10071355
 * @version 1.0
 * @description TODO
 * @date 2020/1/19 16:26
 * @blame 仓储开发组
 **/
@Controller
@RequestMapping("api")
public class RestFulController {


    @Autowired
    private Person person;


    @ResponseBody
    @RequestMapping(value = "user",method = RequestMethod.GET)
    public JSONObject testJson(HttpServletRequest request){
        JSONObject json = new JSONObject();
        json.put("name","小明");
        json.put("age","25");
        json.put("children",person);
        return json;
    }


    @ResponseBody
    @RequestMapping(value = "aop/test",method = RequestMethod.GET)
    public JSONObject testAop(HttpServletRequest request){
        throw new NullPointerException("测试异常");
    }




}
