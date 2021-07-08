package com.msa.review.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {

  @RequestMapping("/review/info")
  public String getReview() {

    return "review Information";
  }
}
