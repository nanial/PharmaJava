<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pharma</title>


        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <link href="/template/css/bootstrap.min.css" rel="stylesheet">
        <link href="/template/css/font-awesome.min.css" rel="stylesheet">
        <link href="/template/css/prettyPhoto.css" rel="stylesheet">
        <link href="/template/css/price-range.css" rel="stylesheet">
        <link href="/template/css/animate.css" rel="stylesheet">
        <link href="/template/css/main.css" rel="stylesheet">
        <link href="/template/css/responsive.css" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Tenor+Sans" rel="stylesheet">


        <script src="js/html5shiv.js"></script>
        <script src="js/respond.min.js"></script>

        <link rel="icon" sizes="256x256" href="/template/images/ico/favicon.png">
    </head>
<body>



    <header id="header"><!--header-->
        <div class="header_top"><!--header_top-->
            <div class="container">
                <div class="row">
                    <div class="col-sm-6">
                        <div class="contactinfo">
                            <ul class="nav nav-pills">
                                <li><a href="#"><i class="fa fa-phone"></i> +375 029 1785241</a></li>
                                <li><a href="#"><i class="fa fa-envelope"></i> pharma@pharma.rus</a></li>
                            </ul>
                        </div>
                    </div>

                </div>
            </div>
        </div><!--/header_top-->

        <div class="header-middle"><!--header-middle-->
            <div class="container">
                <div class="row">
                    <div class="col-sm-4">
                        <div class="logo pull-left">
                            <a href="/"><img src="/template/images/home/logo.png" alt="" /></a>
                        </div>
                    </div>
                    <div class="col-sm-8">
                        <div class="shop-menu pull-right">
                            <ul class="nav navbar-nav">
                                <li><a href="/cart">
                                    <i class="fa fa-shopping-cart"></i> Корзина
                                    (<span id="cart-count"><?php Cart::countItems(); ?></span>)
                                </a>
                                </li>
                                <?php if (User::isGuest()): ?>
                                <li><a href="/login"><i class="fa fa-lock"></i> Вход</a></li>
                                <li><a href="/register"><i class="fa fa-lock"></i> Регистрация</a></li>
                                <?php else: ?>
                                <li><a href="/cabinet"><i class="fa fa-user"></i> Аккаунт</a></li>
                                <li><a href="/logout"><i class="fa fa-unlock"></i> Выход</a></li>
                                <?php endif; ?>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div><!--/header-middle-->

        <div class="header-bottom"><!--header-bottom-->
            <div class="container">
                <div class="row">
                    <div class="col-sm-12">
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                        </div>
                        <div class="mainmenu pull-left">
                            <ul class="nav navbar-nav collapse navbar-collapse">
                                <li><a href="/">Главная</a></li>
                                <li class="dropdown"><a href="#">Аптека<i class="fa fa-angle-down"></i></a>
                                    <ul role="menu" class="sub-menu">
                                        <li><a href="/catalog">Каталог товаров</a></li>
                                        <li><a href="/cart">Корзина</a></li>
                                    </ul>
                                </li>
                                <li><a href="/about">Об аптеке</a></li>
                                <li><a href="/contacts">Напишите нам</a></li>
                                <li><a href="/feedback">Контакты</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div><!--/header-bottom-->

    </header>






