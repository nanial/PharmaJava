<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><jsp:include page="layots/HeaderAdmin.jsp"></jsp:include></head>
<body>


                    <a href="/admin/category/create" class="btn btn-default back">
                        <i class="fa fa-plus"></i> Добавить категорию</a>

                    <h3>Список категорий</h3>

                    <table class="table-bordered table-striped table">
                        <tr>
                            <th>ID категории</th>
                            <th>Название категории</th>
                            <th>Порядковый номер</th>
                            <th>Статус</th>
                            <th></th>
                            <th></th>
                        </tr>
                        <?php foreach ($categoriesList as $category): ?>
                        <tr>
                            <td><?php echo $category['ID']; ?></td>
                            <td><?php echo $category['name']; ?></td>
                            <td><?php echo $category['sort_order']; ?></td>
                            <td><?php echo Category::getStatusText($category['status']); ?></td>
                            <td><a href="/admin/category/update/<?php echo $category['ID']; ?>" title="Редактировать"><i class="fa fa-pencil-square-o"></i></a></td>
                            <td><a href="/admin/category/delete/<?php echo $category['ID']; ?>" title="Удалить"><i class="fa fa-times"></i></a></td>
                        </tr>
                        <?php endforeach; ?>
                    </table>
                    <jsp:include page="layots/footerAdmin.jsp"></jsp:include>

</body>
</html>
