package com.leedcp.service;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author liweiwei
 * @Created date 2020/5/17
 * @Desc
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/spring-mvc.xml", "classpath:config/spring-mybatis.xml"})
public class UserServiceTest {

//    @Resource
//    private UserService userService;
//
//    @Test
//    public void getUser() {
//        User user = userService.getUser("1");
//
//        System.out.println(user.toString());
//    }


}