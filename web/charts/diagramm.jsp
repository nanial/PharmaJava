<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 02.05.2019
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Управление категриями</title>
    <link href="/template/css/bootstrap2.min.css" rel="stylesheet">
    <link href="/template/css/font-awesome.min.css" rel="stylesheet">
    <link href="/template/css/prettyPhoto.css" rel="stylesheet">
    <link href="/template/css/price-range.css" rel="stylesheet">
    <link href="/template/css/animate.css" rel="stylesheet">
    <link href="/template/css/main.css" rel="stylesheet">
    <link href="/template/css/responsive.css" rel="stylesheet">

    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->
    <link rel="icon" sizes="256x256" href="/template/images/ico/favicon.png">

</head><!--/head-->

<!--/header_top-->
<body>

<div class="page-wrapper">

    <header id="header"><!--header-->
        <div class="header_top"><!--header_top-->
            <div class="container">
                <div class="row">
                    <div class="col-sm-6">
                        <div class="contactinfo">
                            <h5>
                                <a href="/admin"><i class="fa fa-edit"></i> Админпанель</a>
                            </h5>
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="social-icons pull-right">
                            <ul class="nav navbar-nav">
                                <li><a href="/"><i class="fa fa-sign-out"></i>На сайт</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>

        </div>
        <section>
            <div class="container">
                <div class="row">
                    <br/>
                    <h4>Выберите отчёт:</h4>
                    <br/>
                    <br/>
                    <ul>
                        <li>
                            Популярность мед.препаратов у клиентов
                            <a href="/charts/diagramm?table=orders">Диаграмма</a>
                            <a href="/charts/diagrammBar?table=orders">Гистограмма</a>
                        </li>
                        <li>
                            Популярность производителей среди заказов
                            <a href="/charts/diagramm?table=manufactures">Диаграмма</a>
                            <a href="/charts/diagrammBar?table=manufactures">Гистограмма</a>
                        </li>
                        <li>
                            Статистика заказов по календарю
                            <a href="/charts/diagramm?table=productToOrders">Диаграмма</a>
                            <a href="/charts/diagrammBar?table=productToOrders">Гистограмма</a>
                        </li>
                        <li>
                            Статусы заказов
                            <a href="/charts/diagramm?table=category">Диаграмма</a>
                            <a href="/charts/diagrammBar?table=category">Гистограмма</a>
                        </li>
                    </ul>

                </div>
            </div>
        </section>
    </header>
</div>

</body>
</html>
