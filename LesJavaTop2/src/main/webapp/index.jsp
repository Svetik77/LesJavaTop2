<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <link href="boots/css/bootstrap.css" rel="stylesheet" type="text/css">  
  <link href="boots/css/bootstrap.js" rel="stylesheet" type="text/css">  
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

   <meta name="_csrf" content="c7418c43-ac2d-4134-9d2e-621b6c5f03ec"/>
    <meta name="_csrf_header" content="X-CSRF-TOKEN"/>
   <title>Подсчет   калорий</title>
  <!--  path to all images -->
     <!--   <base href="/">    --> 
    <title>Java Enterprise (JavasTop)</title>
</head>
<body>
<h3>Проект <a href="https://github.com/JavaWebinar/JavasTop10" target="_blank">Java Enterprise (JavasTop)</a></h3>
<hr>
<ul>
    <li><a href="users">User List</a></li>

    <li><a href="meals">meal List</a></li>
</ul>
<h3>==========index jsp===============</h3>
<nav class="navbar navbar-expand-md navbar-dark bg-dark py-0">
    <div class="container"> <b style="color: fuchsia;">container start</b>
        <a href="meals" class="navbar-brand">
        
        <img src="images/icon-meal.png"> Подсчет калорий link to mail list</a>
        
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <form id="login_form" class="form-inline my-2" action="spring_security_check" method="post">
                            <input class="form-control mr-1" type="text" placeholder="Email" name="username">
                            <input class="form-control mr-1" type="password" placeholder="Password" name="password">
                            <button class="btn btn-success" type="submit">
                                <span class="fa fa-sign-in"></span>
                            </button>
                        <div>
<input type="hidden" name="_csrf" value="c7418c43-ac2d-4134-9d2e-621b6c5f03ec" />
<h3 style="color: fuchsia;">=======input type="hidden==========</h3>
   </div></form>
                </li>
       <!-- languages   -->       
                <li class="nav-item dropdown">
                    <a class="dropdown-toggle nav-link my-1 ml-2" data-toggle="dropdown">ru</a>
                    <div class="dropdown-menu">
                        <a class="dropdown-item" href="/login?lang=en">English</a>
                        <a class="dropdown-item" href="/login?lang=ru">Русский</a>
                    </div>
                </li>
            </ul>
        </div>
    </div>
</nav>
<script type="text/javascript">
    const localeCode = "ru";
</script>

<div class="jumbotron py-0">
    <div class="container">
        
            <div class="pt-4">
                <a class="btn btn-lg btn-success" href="register">Регистрация &raquo;</a>
                <button type="submit" class="btn btn-lg btn-primary" onclick="login('user@yandex.ru', 'password')">
                    Зайти как User
                </button>
                <button type="submit" class="btn btn-lg btn-primary" onclick="login('admin@gmail.com', 'admin')">
                    Зайти как Admin
                </button>
            </div>
        </div>
    </div>
<div class="container lead">
    &nbsp;&nbsp;&nbsp;
    <a href="https://github.com/JavaOPs/topjava">Java Enterprise проект</a> 
</div>

<footer class="footer">
    <div class="container">
        <span class="text-muted">Приложение по проекту <a href="https://github.com/JavaOPs/topjava" target=_blank>Maven/ Spring/ Security/ JPA(Hibernate)/ Jackson/jQuery</a></span>
    </div>
</footer>
<script type="text/javascript">

    function login(username, password) {
        setCredentials(username, password);
        $("#login_form").submit();
    }
    function setCredentials(username, password) {
        $('input[name="username"]').val(username);
        $('input[name="password"]').val(password);
    }
</script>
<h3>=========================</h3>
 <a><img src="images/icon-meal.png"> test img</a>
</body>
</html>
