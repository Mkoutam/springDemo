package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@Controller
public class SayHelloController {
 @RequestMapping("say-hello")
 
 public String sayHello()
 { 
	 return "Hello!What you doing!  ";
 }
 
 @RequestMapping("/say-hello-jsp")
 
 public String sayHelloJsp()
 { 
	 return "sayHelloo";
 }
}

