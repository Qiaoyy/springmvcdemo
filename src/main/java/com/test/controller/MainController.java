package com.test.controller;

import com.test.repository.UserRepository;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Qiaoyy on 2017/3/29.
 */
@Controller
@SessionAttributes("user")
public class MainController {
    @Autowired
    UserRepository userRepository;
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "test";
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        System.out.println(session.getAttribute("userName")+"aaaaaaaaaaaaaaaaaaaaaaaaaa");
        return "index2";
    }

    @RequestMapping(value = "/user/login", method = RequestMethod.GET)//value:请求地址
    public String login() {
        return "login/login"; // 转到 login/login.jsp页面
    }


    @ResponseBody
    @RequestMapping(value = "/loginP",method = RequestMethod.POST)
    public String  login(HttpSession session, @RequestBody JSONObject jsonObject){
        String  userName= jsonObject.getString("userName");
        String  userPassword =jsonObject.getString("userPassword");


        try{
            if(userName!= null &&userRepository.validateUser(userName).equals(userPassword)){
                session.setAttribute("userName", userName);
                return "success";
            }
        }catch (Exception e){
            return "fail";
        };

        return "fail";
    }
    @RequestMapping(value = "/user/success", method = RequestMethod.GET)//value:请求地址
    public String loginSuccess() {
        return "login/success"; // 转到 login/login.jsp页面
    }
}
