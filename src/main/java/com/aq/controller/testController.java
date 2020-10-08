package com.aq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class testController {

//    1、简单的谈一下 SpringMVC 的工作流程

//    处理模型数据的方式一：将方法的返回值设置为ModelAndView
    @RequestMapping()
    public ModelAndView testModelAndView() {
//        1、创建 ModeAndView 对象
        ModelAndView modelAndView = new ModelAndView();
//        2、设置模型数据，最终会放到request域中（modelAndView.addObject(attributeName,attributeValue)）
        modelAndView.addObject("user","admin");
//        3、设置视图
        modelAndView.setViewName("success");
        return modelAndView;
    }
}
