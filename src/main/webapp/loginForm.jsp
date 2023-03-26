<!-- /*
* Template Name: Sterial
* Template Author: Untree.co
* Tempalte URI: https://untree.co/
* License: https://creativecommons.org/licenses/by/3.0/
*/ -->
<%@page language="java" contentType="text/html;utf-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>

    <meta name="author" content="Untree.co"/>
    <link rel="shortcut icon" href="favicon.png"/>

    <meta name="description" content=""/>
    <meta name="keywords" content="bootstrap, bootstrap5"/>

    <link rel="preconnect" href="https://fonts.googleapis.com"/>
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin/>
    <link
            href="https://fonts.googleapis.com/css2?family=Brygada+1918:ital,wght@0,400;0,600;0,700;1,400&family=Inter:wght@400;700&display=swap"
            rel="stylesheet"
    />

    <link rel="stylesheet" href="fonts/icomoon/style.css"/>
    <link rel="stylesheet" href="fonts/flaticon/font/flaticon.css"/>

    <link rel="stylesheet" href="css/tiny-slider.css"/>
    <link rel="stylesheet" href="css/aos.css"/>
    <link rel="stylesheet" href="css/flatpickr.min.css"/>
    <link rel="stylesheet" href="css/glightbox.min.css"/>
    <link rel="stylesheet" href="css/style.css"/>

    <title>Sterial &mdash; Free Bootstrap 5 Website Template by Untree.co</title>
</head>
<body>
<div class="site-mobile-menu site-navbar-target">
    <div class="site-mobile-menu-header">
        <div class="site-mobile-menu-close">
            <span class="icofont-close js-menu-toggle"></span>
        </div>
    </div>
    <div class="site-mobile-menu-body"></div>
</div>

<%--navbar start--%>
<%@include file="nav.jsp"%>
<%--navbar end--%>

<div class="hero overlay">
    <div class="img-bg rellax">
        <img src="images/hero_2.jpg" alt="Image" class="img-fluid h-30"/>
    </div>
    <div class="container">
        <div class="row align-items-center justify-content-start">
            <div class="col-lg-6 mx-auto text-center">
                <h1 class="heading" data-aos="fade-up">Welcome !</h1>
                <p data-aos="fade-up">Use our website with Log In</p>
            </div>
        </div>
    </div>
</div>

<div class="section">
    <div class="container" id="inform">
        <div class="row">
            <div class="col-12" data-aos="fade-up" data-aos-delay="0">
                <h2 class="heading mb-5">Sign In</h2>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-8" data-aos="fade-up" data-aos-delay="200">
                <form method="post" action="loginProcess">
                    <div class="row">
                        <div class="col-6 mb-3">
                            <input
                                    type="text"
                                    class="form-control"
                                    placeholder="Input your ID"
                                    name="id"
                                    value="${cookie.remem.value}"
                                    id="inId"
                            />
                        </div>
                        <div></div>
                        <div class="col-6 mb-3">
                            <input
                                    type="password"
                                    class="form-control"
                                    placeholder="Input your Password"
                                    name="pass"
                                    id="inPw"
                            />
                        </div>

                        <div class="form-check mb-3">
                            <label class="form-check-label">
                                <c:if test="${cookie.remem.value == null}">
                                    <input class="form-check-input" type="checkbox" name="remember">아이디 기억하기
                                </c:if>

                                <c:if test="${cookie.remem.value != null}">
                                    <input class="form-check-input" type="checkbox" name="remember" checked>아이디 기억하기
                                </c:if>
                            </label>
                        </div>

                        <div class="col-12">
                            <input
                                    type="submit"
                                    value="Sign In"
                                    class="btn btn-primary"
                            />
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
<!-- /.untree_co-section -->

<div class="site-footer">
    <div class="container">
        <div class="row">
            <div class="col-lg-4">
                <div class="widget">
                    <h3>About Passport<span class="text-primary">.</span></h3>
                    <p>
                        Far far away, behind the word mountains, far from the countries
                        Vokalia and Consonantia, there live the blind texts.
                    </p>
                </div>
                <!-- /.widget -->
                <div class="widget">
                    <h3>Connect</h3>
                    <ul class="list-unstyled social">
                        <li>
                            <a href="#"><span class="icon-instagram"></span></a>
                        </li>
                        <li>
                            <a href="#"><span class="icon-twitter"></span></a>
                        </li>
                        <li>
                            <a href="#"><span class="icon-facebook"></span></a>
                        </li>
                        <li>
                            <a href="#"><span class="icon-linkedin"></span></a>
                        </li>
                        <li>
                            <a href="#"><span class="icon-pinterest"></span></a>
                        </li>
                        <li>
                            <a href="#"><span class="icon-dribbble"></span></a>
                        </li>
                    </ul>
                </div>
                <!-- /.widget -->
            </div>
            <!-- /.col-lg-3 -->

            <div class="col-lg-2 ml-auto">
                <div class="widget">
                    <h3>Links</h3>
                    <ul class="list-unstyled float-left links">
                        <li><a href="#">About us</a></li>
                        <li><a href="#">Services</a></li>
                        <li><a href="#">News</a></li>
                        <li><a href="#">Careers</a></li>
                        <li><a href="#">Contact</a></li>
                    </ul>
                </div>
                <!-- /.widget -->
            </div>
            <!-- /.col-lg-3 -->

            <div class="col-lg-2">
                <div class="widget">
                    <h3>Company</h3>
                    <ul class="list-unstyled float-left links">
                        <li><a href="#">About us</a></li>
                        <li><a href="#">Services</a></li>
                        <li><a href="#">News</a></li>
                        <li><a href="#">Careers</a></li>
                        <li><a href="#">Contact</a></li>
                    </ul>
                </div>
                <!-- /.widget -->
            </div>
            <!-- /.col-lg-3 -->

            <div class="col-lg-3">
                <div class="widget">
                    <h3>Contact</h3>
                    <address>43 Raymouth Rd. Baltemoer, London 3910</address>
                    <ul class="list-unstyled links mb-4">
                        <li><a href="tel://11234567890">+1(123)-456-7890</a></li>
                        <li><a href="tel://11234567890">+1(123)-456-7890</a></li>
                        <li><a href="mailto:info@mydomain.com">info@mydomain.com</a></li>
                    </ul>
                </div>
                <!-- /.widget -->
            </div>
            <!-- /.col-lg-3 -->
        </div>
        <!-- /.row -->

        <div class="row mt-5">
            <div class="col-12 text-center">
                <p class="mb-0">
                    Copyright &copy;
                    <script>
                        document.write(new Date().getFullYear());
                    </script>
                    . All Rights Reserved. &mdash; Designed with love by
                    <a href="https://untree.co">Untree.co</a>
                    <!-- License information: https://untree.co/license/ -->
                    Distributed By
                    <a href="https:/themewagon.com" target="_blank">ThemeWagon</a>
                </p>
            </div>
        </div>
        <!-- /.container -->
    </div>
    <!-- /.site-footer -->

    <!-- Preloader -->
    <div id="overlayer"></div>
    <div class="loader">
        <div class="spinner-border text-primary" role="status">
            <span class="visually-hidden">Loading...</span>
        </div>
    </div>

    <script src="js/bootstrap.bundle.min.js"></script>
    <script src="js/tiny-slider.js"></script>
    <script src="js/aos.js"></script>
    <script src="js/navbar.js"></script>
    <script src="js/counter.js"></script>
    <script src="js/rellax.js"></script>
    <script src="js/flatpickr.js"></script>
    <script src="js/glightbox.min.js"></script>
    <script src="js/custom.js"></script>
</div>

</body>
</html>
