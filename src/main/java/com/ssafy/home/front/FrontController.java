package com.ssafy.home.front;

import com.ssafy.home.controller.HomeController;
import com.ssafy.home.controller.UserController;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


//클라이언트로부터 들어오는 요청 받기. 받은 요청을 구분한 뒤 Controller에게 넘기기 
/*
(초기화면) http://localhost:8080/mvc/list.mvc
(상세화면) http://localhost:8080/mvc/read.mvc
(등록을 위한 입력 화면) http://localhost:8080/mvc/insertForm.mvc
(입력 처리) http://localhost:8080/mvc/insertProcess.mvc-->저장 후 초기화면으로 돌아오기
(삭제) http://localhost:8080/mvc/delete.mvc-->삭제 후 초기화면으로 돌아오기
(로그인을 위한 입력화면) http://localhost:8080/mvc/loginForm.mvc
(로그인처리) http://localhost:8080/mvc/loginProcess.mvc
*/
//@WebServlet("*.mvc")
@WebServlet(name = "servlet", value="/")
public class FrontController extends HttpServlet {
    UserController ucon;//login, logout, loginProcess
    HomeController hcon;

    public FrontController() {
        hcon = new HomeController();
        ucon = new UserController();
    }

    private void process(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String reqString = request.getServletPath();
        if (reqString.equals("/loginForm")) {//로그인 화면
            ucon.loginForm(request, response);
        } else if (reqString.equals("/loginProcess")) {//로그인 처리(db체크, 세션에 로그인 정보 저장)
            ucon.loginProcess(request, response);
        } else if (reqString.equals("/signupForm")) {
            ucon.signupForm(request, response);
        } else if (reqString.equals("/signupProcess")) {
            ucon.signupProcess(request, response);
        } else if (reqString.equals("/modifyForm")) {
            ucon.modifyForm(request, response);
        } else if (reqString.equals("/modifyProcess")) {
            ucon.modifyProcess(request, response);
        } else if (reqString.equals("/accountInfo")) {
            ucon.accountInfo(request, response);
        } else if (reqString.equals("/accountSearch")) {
            ucon.accountSearch(request, response);
        } else if (reqString.equals("/findPass")) {
            ucon.findPass(request, response);
        } else if (reqString.equals("/accountSearchProcess")) {
            ucon.accountSearchProcess(request, response);
        } else if (reqString.equals("/accountDelete")) {
            ucon.accountDelete(request, response);
        } else if (reqString.equals("/logout")) {//로그아웃
            ucon.logout(request, response);
        } else if (reqString.equals("/getLocalNames")){
            hcon.getSidos(request, response);
        } else if (reqString.equals("/getAptList")){
            hcon.getList(request, response);
        } else if (reqString.equals("/")) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
            dispatcher.forward(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }

}
