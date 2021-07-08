package com.msa.news.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {

  @RequestMapping("/news/info")
  public String getNews() {

    return "news Information";
  }
}
