package com.ZAGA.JPAdemo.Controller;

import com.ZAGA.JPAdemo.DAO.UserDao;
import com.ZAGA.JPAdemo.Model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

   @Autowired
   UserDao userdao;

 @RequestMapping("addUser")   

 public String User(User user) {
    

    return "index.jsp";

 }

public String addUser(User user) {

   return "index.jsp";

}



}