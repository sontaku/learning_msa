package com.msa.advertising.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdvertisingController {

  @RequestMapping("/advertising/info")
  public String getAdvertising() {

    return "advertising Information";
  }
}
