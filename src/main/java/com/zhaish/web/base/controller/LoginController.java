package com.zhaish.web.base.controller;

import com.zhaish.web.base.bean.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/user")

public class LoginController {
    private static final Logger log = LoggerFactory.getLogger(LoginController.class);
    @RequestMapping("login")
    public @ResponseBody Object login(@RequestBody Member member, HttpServletRequest request, HttpServletResponse response){
        log.info("Member:{} login in success",member.getCode());
        ResponseEntity<String> res = new ResponseEntity(member,HttpStatus.OK);


        return res;
    }
    @RequestMapping("/hello")
    public String hello(@RequestParam String name){
        return String.format("Hello,%s !",name);
    }

}
