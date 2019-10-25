package servlets;

import entities.Product;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

@WebServlet(name = "AdminProductServlet", urlPatterns = {"/adminProductServlet"})

public class AdminProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { response.setContentType("text/html");

        try{

            Connection connection = ConnectorDB.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery ("select a.ID, a.price, m.NameOfMedical " +
                    "from product a inner join medical m on a.medicalID = m.ID " +
                    "where a.status = 1 order by m.NameOfMedical asc");
            while (resultSet.next()){
                Properties properties = new Properties();
                properties.setProperty("id", resultSet.getString(1));
                properties.setProperty("price", resultSet.getString(2));
                properties.setProperty("nameOfMedical", resultSet.getString(3));
                FileOutputStream fileOutputStream = new FileOutputStream("adminProduct.properties");
                properties.store(fileOutputStream,"");
            }

        }
        catch(SQLException sq){
            System.out.println(sq.getStackTrace());
        }

       PrintWriter p = response.getWriter();
       p.append("<html>" +
               "<head>" +

               "        <title>admin</title>" +
               "        <meta charset='utf-8'>" +
               "        <meta name='viewport' content='width=device-width, initial-scale=1.0'>" +
               "        <meta name='description' content=''>" +
               "        <meta name='author' content=''>" +
               "        <title>Admin panel</title>" +
               "        <link href='/template/css/bootstrap2.min.css' rel='stylesheet'>" +
               "        <link href='/template/css/font-awesome.min.css' rel='stylesheet'>" +
               "        <link href='/template/css/prettyPhoto.css' rel='stylesheet'>" +
               "        <link href='/template/css/price-range.css' rel='stylesheet'>" +
               "        <link href='/template/css/animate.css' rel='stylesheet'>" +
               "        <link href='/template/css/main.css' rel='stylesheet'>" +
               "        <link href='/template/css/responsive.css' rel='stylesheet'>" +

               "        <!--[if lt IE 9]>" +
               "        <script src='js/html5shiv.js'></script>" +
               "        <script src='js/respond.min.js></script>" +
               "        <![endif]-->" +
               "        <link rel='icon' sizes='256x256' href='/template/images/ico/favicon.png'>" +

               "</head>" +

               "<body>" +
               "    <header id='header'><!--header-->" +
               "        <div class='header_top'><!--header_top-->" +
               "            <div class='container'>" +
               "                <div class='row'>" +
               "                    <div class='col-sm-6'>" +
               "                        <div class='contactinfo'>" +
               "                            <h5>" +
               "                                <a href='/admin'><i class='fa fa-edit'></i> Admin panel</a>" +
               "                            </h5>" +
               "                        </div>" +
               "                    </div>'" +
               "                    <div class='col-sm-6'>" +
               "                        <div class='social-icons pull-right'>" +
               "                            <ul class='nav navbar-nav'>'" +
               "                                <li><a href='/'><i class='fa fa-sign-out'></i>On the site</a></li>" +
               "                            </ul>" +
               "                        </div>" +
               "                    </div>" +
               "                </div>" +
               "            </div>" +

               "        </div>" +
               "    </header>" +


               "                    <h3>List of medical</h3>" +

               "                    <table class='table-bordered table-striped table'>" +
               "                        <tr>" +
               "                            <th>ID of product</th>" +
               "                            <th>Code</th>" +
               "                            <th>Name of medical</th>" +
               "                            <th>Price</th>" +
               "                            <th></th>" +
               "                            <th></th>" +
               "                        </tr>" +
               "                        <tr>" +

               "                        <td>" + new Product().getNameOfMedical() + "</td>" +
               "                        <td>" + new Product().getId() + "</td>" +
               "                        <td>"+ new Product().getPrice() + "</td>" +
               "                        <td>"+ new Product().getCode() + "</td>" +
               "             <td>" +
               "                 <a href='/admin/product/update/' title='Update'>" +
               "                        <i class='fa fa-pencil-square-o'></i>" +
               "                 </a>" +
               "             </td>" +
               "             <td>" +
               "                 <a href='/admin/product/delete/' title='Delete'>" +
               "                        <i class='fa fa-times'></i>" +
               "                 </a>" +
               "             </td>" +
               "         </tr>" +
               "                    </table>" +
               "<jsp:include page='layots/footerAdmin.jsp'></jsp:include>");
       p.flush();
    }

}
