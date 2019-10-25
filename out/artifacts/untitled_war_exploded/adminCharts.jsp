<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><jsp:include page="layots/HeaderAdmin.jsp"></jsp:include></head>


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

<jsp:include page="layots/footerAdmin.jsp"></jsp:include>
</body>
</html>
