package com.in28minutes.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * author : ms.Lee
 * date   : 2024-01-03
 */
@RestController
public class CurrencyConfigurationController {

  @Autowired
  private CurrencyServiceConfiguration configuration;

  @RequestMapping(value = "/currency-configuration")
  public CurrencyServiceConfiguration retrieveAllCourses() {

    return configuration;
  }
}
