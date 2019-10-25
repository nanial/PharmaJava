<%@ page import="entities.Product" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="servlets.AdminProductServlet" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<jsp:include page="layots/HeaderAdmin.jsp"></jsp:include>


                    <a href="/admin/product/create" class="btn btn-default back">
                        <i class="fa fa-plus"></i> Добавить товар
                    </a>

                    <h3>Список препаратов</h3>

                    <table class="table-bordered table-striped table">
                        <tr>
                            <th>ID товара</th>
                            <th>Артикул</th>
                            <th>Наименование препарата</th>
                            <th>Цена</th>
                            <th></th>
                            <th></th>
                        </tr>
                        <c:forEach var = "elem" items="${prod}" >

                        <tr>

                            <td><c:out value="${elem.getNameOfMedical()}"/></td>
                            <td><c:out value="${elem.text}"/></td>
                            <td><c:out value="${elem.getId}"/> </td>
                            <td><%new Product().getId();%></td>
                            <td>
                                <a href="/admin/product/update/<c:out value='${elem.id}'/>" title="Редактировать">
                                    <i class="fa fa-pencil-square-o"></i>
                                </a>
                            </td>
                            <td>
                                <a href="/admin/product/delete/<c:out value='${elem.id}'/>" title="Удалить">
                                    <i class="fa fa-times"></i>
                                </a>
                            </td>
                        </tr>
                        </c:forEach>

                    </table>
<jsp:include page="layots/footerAdmin.jsp"></jsp:include>
