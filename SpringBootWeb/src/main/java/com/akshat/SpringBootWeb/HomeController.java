package com.akshat.SpringBootWeb;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("Home Page Loaded");
        return "index";
    }



    // Servlet way
//    @RequestMapping("add")
//    public String add(HttpServletRequest req, HttpSession session){
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//        int result = num1 + num2;
//
//        session.setAttribute("result", result);
//        return "result.jsp";
//    }



    //Spring boot way
//    @RequestMapping("add")
    //RequestParam is optional, used when we want to use different name for variable
//    public String add(@RequestParam("num1") int num, int num2, HttpSession session){
//
//        int result = num + num2;
//
//        session.setAttribute("result", result);
//        return "result.jsp";
//    }




    //Model Object
    @RequestMapping("add")
    public String add(@RequestParam("num1") int num, int num2, Model model){
        int result = num + num2;

//        session.setAttribute("result", result);
        model.addAttribute("result",result);
        return "result";
    }
}
