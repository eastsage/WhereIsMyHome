<%@page language="java" contentType="text/html;utf-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- 로그인 안한 경우 --%>
<c:if test="${empty user}">
    <div class="col-6 col-lg-3 text-lg-end">

    <ul class="js-clone-nav d-none d-lg-inline-block text-end site-menu ">
        <li class="cta-button">
            <a href="loginForm">Sign In</a>
        </li>
        <li class="cta-button">
            <a href="signupForm">Sign Up</a>
        </li>
    </ul>

    <a href="#" class="burger ms-auto float-end site-menu-toggle js-menu-toggle d-inline-block d-lg-none light"
       data-toggle="collapse" data-target="#main-navbar">
        <span></span>
    </a>


</c:if>

<%-- 로그인 한 경우 --%>
<c:if test="${!empty user}">
    <div class="col-6 col-lg-3 text-lg-end">
        <ul class="js-clone-nav d-none d-lg-inline-block text-end site-menu ">
            <li class="cta-button">
                <a href="accountInfo">${user.id} 정보</a> <%--회원 정보로 링크 달아야함--%>
            </li>
            <li class="cta-button">
                <a href="logout">로그아웃</a>
            </li>
        </ul>

        <a href="#" class="burger ms-auto float-end site-menu-toggle js-menu-toggle d-inline-block d-lg-none light"
           data-toggle="collapse" data-target="#main-navbar">
            <span></span>
        </a>
    </div>
</c:if>