package com.example.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
@SpringBootApplication
public class DemoApplication {

  @RequestMapping("/")
  @ResponseBody
  public String hello(){
	//add note 20190126 new
    return"Hello H3C Demo!";
  }


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
