package com.msa.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @RequestMapping("/user/info")
  public String getUser() {

    return "user Information";
  }
}
