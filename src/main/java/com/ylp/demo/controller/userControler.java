package com.ylp.demo.controller;

import com.ylp.demo.databases.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试模板引擎
 * \* User: illusion
 * \* Date: 2020/3/13
 * \* Time: 15:33
 * \* Description:
 * \
 */
@Controller
public class userControler {
      @RequestMapping("/thymel.html")
      public String thymeData(Model model){
            Data data=new Data();
            data.setUaserName("nahao1");
            model.addAttribute(data);
            return "/thymeleaf.html";
      }
}
