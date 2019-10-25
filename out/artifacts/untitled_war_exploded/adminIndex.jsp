<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="layots/HeaderAdmin.jsp"></jsp:include>

    <div class="container">
        <div class="row">
            <h4>Добрый день, администратор!</h4>
            <ul>
                <li><a href="/adminProduct">Управление товарами</a></li>
                <li><a href="/adminCategory">Управление категориями</a></li>
                <li><a href="/adminOrder">Управление заказами</a></li>
                <li><a href="/chartsIndex">Отчеты</a></li>
            </ul>

        </div>
    </div>
<jsp:include page="layots/footerAdmin.jsp"></jsp:include>

