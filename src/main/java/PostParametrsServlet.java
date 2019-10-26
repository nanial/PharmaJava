import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.Enumeration;

@WebServlet(name = "PostParametrsServlet", urlPatterns = {"/postParametrServ"})

public class PostParametrsServlet extends GenericServlet {

      public void service(ServletRequest request, ServletResponse response)
              throws ServletException, IOException{
          PrintWriter printWriter = response.getWriter();
          Enumeration enumeration = request.getParameterNames();
          SecondServlet secondServlet = new SecondServlet();
          while (enumeration.hasMoreElements()){
              printWriter.print((String) enumeration.nextElement());
              printWriter.println(request.getParameter((String) enumeration.nextElement()));
          }
           printWriter.close();
      }
}
