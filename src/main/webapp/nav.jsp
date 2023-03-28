<%--
  Created by IntelliJ IDEA.
  User: dong
  Date: 2023/03/27
  Time: 12:29 AM
  To change this template use File | Settings | File Templates.
--%>
<nav class="site-nav mt-3">
  <div class="container">

    <div class="site-navigation">
      <div class="row">
        <div class="col-6 col-lg-3">
          <a href="/" class="logo m-0 float-start">SSAFY</a>
        </div>
        <div class="col-lg-6 d-none d-lg-inline-block text-center nav-center-wrap">
          <ul class="js-clone-nav  text-center site-menu p-0 m-0">
            <li class="active"><a href="/">Home</a></li>

          </ul>
        </div>

        <jsp:include page="loginCheck.jsp"/>

      </div>
    </div>
  </div>
</nav>
