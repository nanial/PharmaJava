<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head><jsp:include page="layots/HeaderAdmin.jsp"></jsp:include></head>

                    <h3>Список заказов</h3>
                    <table class="table-bordered table-striped table">
                        <tr>
                            <th>ID заказа</th>
                            <th>Дата оформления</th>
                            <th>ID пользователя</th>
                            <th>Комментарий пользователя</th>
                            <th>Статус</th>
                            <th></th>
                            <th></th>
                            <th></th>
                        </tr>
                        <?php foreach ($ordersList as $order): ?>
                        <tr>
                            <td>
                                <a href="/admin/order/view/<?php echo $order['ID']; ?>">
                                    <?php echo $order['ID']; ?>
                                </a>
                            </td>
                            <td><?php echo $order['date']; ?></td>
                            <td><?php echo $order['userID']; ?></td>
                            <td><?php echo $order['userComment']; ?></td>
                            <td><?php echo Order::getStatusText($order['status']); ?></td>
                            <td><a href="/admin/order/view/<?php echo $order['ID']; ?>" title="Смотреть"><i class="fa fa-eye"></i></a></td>
                            <td><a href="/admin/order/update/<?php echo $order['ID']; ?>" title="Редактировать"><i class="fa fa-pencil-square-o"></i></a></td>
                            <td><a href="/admin/order/delete/<?php echo $order['ID']; ?>" title="Удалить"><i class="fa fa-times"></i></a></td>
                        </tr>
                        <?php endforeach; ?>
                    </table>
<jsp:include page="layots/footerAdmin.jsp"></jsp:include>
</body>
</html>
