<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<jsp:include page="/layots/Header.jsp"></jsp:include>
<div class="page-buffer"></div>
<section>
    <div class="container">
        <div class="row">

            <h3>Кабинет пользователя</h3>

            <h4>Привет, <?php echo $user['name'];?>!</h4>
            <ul>

            </ul>

        </div>
    </div>
</section>
<jsp:include page="layots/Footer.jsp"></jsp:include>
</body>
</html>
