
import servlets.ConnectorDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
@WebServlet(name = "secondServlet", urlPatterns = {"/secondServlet"})
public class SecondServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();
        printWriter.println("Suppliers");

        try {
            Connection connection = ConnectorDB.getConnection();
            Statement statement = connection.createStatement();


            ResultSet resultSet = statement.executeQuery("select * from suppliers");
            while (resultSet.next()){
                printWriter.println(resultSet.getInt(1) + " " + resultSet.getString(2)
                        + " " + resultSet.getString(3) + " " + resultSet.getInt(4));
            }
            ResultSet resultSet1 = statement.executeQuery
                    ("select a.ID, a.price, a.isNew, m.NameOfMedical, a.image " +
                            "from product a inner join medical m on a.medicalID = m.ID " +
                            "where a.status = 1 order by m.NameOfMedical asc");
            while (resultSet1.next()){
                printWriter.println(resultSet1.getInt(1) + " " + resultSet1.getLong(2)
                + " " + resultSet1.getInt(3) + " " + resultSet1.getString(4) + " " +
                        resultSet1.getBlob(5));
            }

            connection.close();
        }catch (SQLException sq){
            sq.printStackTrace();
        }
    }
}