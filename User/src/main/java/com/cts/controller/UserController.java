package com.cts.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.bean.User;
import com.cts.service.MyUserDetailsService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	MyUserDetailsService service;
	
    @GetMapping(path="/basicauth")
    public String user() {
        return " user";
    }
	



}
