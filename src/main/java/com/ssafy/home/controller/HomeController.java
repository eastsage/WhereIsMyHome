package com.ssafy.home.controller;

import com.ssafy.home.service.HomeService;
import com.ssafy.home.service.HomeServiceImpl;

import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HomeController {
    private HomeService homeService;

    public HomeController(){
        this.homeService = new HomeServiceImpl();
    }

    public void getSidos(HttpServletRequest request, HttpServletResponse response) {
        String sido = request.getParameter("sido");
        String gugun = request.getParameter("gugun");
        String dong = request.getParameter("dong");

        request.setAttribute("sidos", homeService.getSidos());
        request.setAttribute("guguns", homeService.getGuguns(sido));
        request.setAttribute("dongs", homeService.getDongs(sido, gugun));
        request.setAttribute("sido", sido);
        request.setAttribute("gugun", gugun);
        request.setAttribute("dong", dong);

        try {
            System.out.println("sido : " + sido);
            RequestDispatcher dis = request.getRequestDispatcher("/home.jsp");
            dis.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
