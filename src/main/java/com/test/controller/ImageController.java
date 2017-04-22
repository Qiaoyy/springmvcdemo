package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;

/**
 * Created by Qiaoyy on 2017/4/13.
 */
@Controller
public class ImageController {
    @RequestMapping(value = "/img", method = RequestMethod.GET)
    public String test() {
        return "imageUpload";
    }
    @RequestMapping(value="/test2")
    public ModelAndView getData(HttpServletRequest request, HttpServletResponse response, HttpSession httpSession,
                                @RequestParam(value="file",required=false)MultipartFile file
    )throws Exception{
        String filePath="";
        if (!file.isEmpty()) {
            try {
                // 文件保存路径
                filePath = request.getSession().getServletContext().getRealPath("/") + "upload/"
                        + file.getOriginalFilename();
                // 转存文件
                file.transferTo(new File(filePath));
                System.out.print("成功");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        httpSession.setAttribute("path", "upload/"+file.getOriginalFilename());
        response.sendRedirect("/img");
        return null;
    }
}
