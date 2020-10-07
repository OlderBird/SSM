package com.aq.controller;

import com.aq.bean.User;
import com.aq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getValidateCode")
    public void selectAll(Model model, HttpServletRequest request, HttpServletResponse response, HttpSession session) {

        //设置相应类型,告诉浏览器输出的内容为图片
        response.setContentType("image/jpeg");

        //设置响应头信息，告诉浏览器不要缓存此内容
        response.setHeader("pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expire", 0);

        RandomValidateCode randomValidateCode = new RandomValidateCode();

        try {
            String testStr = randomValidateCode.getRandcode(request, response);//输出图片方法
            System.out.println(testStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
