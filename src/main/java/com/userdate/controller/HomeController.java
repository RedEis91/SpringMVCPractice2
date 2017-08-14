package com.userdate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.sql.DriverManager;

@Controller
public class HomeController {

    @RequestMapping("/")
    public ModelAndView helloWorld()
    {
        ModelAndView mv = new
                ModelAndView("welcome");
        mv.addObject("message","Hello World!!!");
        mv.addObject("title", "Welcome to GC Coffee Shop");
        return mv;
    }

    @RequestMapping(value = "getAllCustomers")
    public ModelAndView getAllCustomers() {
        // defined the data for the connection
        //address of the database
        String dbAddress = "jdbc:mysql://localhost:3306/northwind";
        //user name
        String username = "root";
        //password
        String password = "Createordie!1991";

        //load the driver, needs to be wrapped in try catch so that program doesn't crash:
        try {
            //dynamic:
            Class.forName("com.mysql.jdbc.Driver");

            //static load: (commented out for now)
            //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @RequestMapping("/register")
    public ModelAndView register () {
        return new ModelAndView("register", "inst",
                "Please enter info: ");
    }



    //action that gets called>
    @RequestMapping("/formhandler")
        public ModelAndView formhandler(
                @RequestParam("firstname") String firstname,
                @RequestParam("lastname") String lastname,
                @RequestParam("email") String email,
                @RequestParam("phonenumber") String phonenumber,
                @RequestParam("password") String password)

        {
            ModelAndView mv = new ModelAndView("AddUser");
            mv.addObject("firstname", firstname);
            mv.addObject("lastname", lastname);
            mv.addObject("email", email);
            mv.addObject("phonenumber", phonenumber);
            mv.addObject("password", password);

            return mv;
        }

    }
