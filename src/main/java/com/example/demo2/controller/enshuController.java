package com.example.demo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping
public class enshuController {
  @Controller
@RequestMapping("/enshu-scope")
public class sessionScopeController{

@Autowired
private HttpSession session;
@RequestMapping("")
public String index(){
   
  if (session.getAttribute("name") == null) {
      return "enshu-scope-form";  
    }
    
    return "redirect:/enshu-scope/home";
}

@RequestMapping("/input-name")
public String inputName(String name, String pass){

    session.setAttribute("pass" , pass);
 session.setAttribute("name" , name);
 if( "aaa@abc".equals(name) && "ch3n3gke".equals(pass)){
  return "result-enshu-scope1";
 }else{
    return "enshu-scope-form";
 }
} 
@RequestMapping("/input-age")
public String toPage2(){
 return "result-enshu-scope2";
}
}
}


