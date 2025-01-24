package com.example.demo2.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/session-scope")
public class sessionScopeController{

@Autowired
private HttpSession session;
@RequestMapping("")
public String index(){
    return "session-scope-form";
}

@RequestMapping("/input-name")
public String inputName(String name,String pass){
 session.setAttribute("name", name);
 session.setAttribute("pass", pass);
 if( "aaa@abc".equals(name) && "ch3n3gke".equals(pass)){
    return "result-session-scope1"; 
 }
 return null;

 }
 


@RequestMapping("/input-name1")
public String toPage1(){
 return "result-session-scope1";
}

@RequestMapping("/input-name2")
public String toPage2(){
 return "result-session-scope2";
}

@RequestMapping("/input-name3")
public String toPage3(){
 return "result-session-scope3";
}
}