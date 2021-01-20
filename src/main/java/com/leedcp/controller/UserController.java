package com.leedcp.controller;

import com.leedcp.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @Author liweiwei
 * @Created date 2020/5/17
 * @Desc
 **/
@Controller
public class UserController {


    private  final static Logger logger  = LoggerFactory.getLogger(UserController.class);

    @Resource
    private UserService userService;

    @RequestMapping("/tologin")
    public String tologin(){
        return "/WEB-INF/index";
    }

//    @RequestMapping("/getUserInfo")
//    public ModelAndView getUserInfo(HttpServletResponse response)throws Exception{
////        User user = userService.getUser("1");
//
//        ModelAndView mav = new ModelAndView();
////        mav.addObject(user);
////        mav.setViewName("index");
//
//        return mav;
//    }

//    @RequestMapping("save")
//    public void save(User user)throws Exception{
////        boolean isSuccess = userService.save(user);
//    }
}

