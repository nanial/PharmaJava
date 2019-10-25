

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet(name = "Myservlet", urlPatterns = {"/servlet"})

public class Myservlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String s = request.getParameter("name is");
        String s1 = request.getParameter("surname is");


        HttpSession httpSession = request.getSession();

        if (httpSession.getAttribute("counter") == null) {
            httpSession.setAttribute("counter", 0);

        }
        Integer i = (Integer) httpSession.getAttribute("counter");
        i++;
        httpSession.setAttribute("counter", i);


        PrintWriter printWriter = response.getWriter();
        printWriter.println(i);

        printWriter.println("Hello, " + s + " " + s1);
        printWriter.println(request.getServletContext());
        //RequestDispatcher requestDispatcher = request.getRequestDispatcher("/secondServlet");
        //requestDispatcher.forward(request, response);
        Cookie cookie = new Cookie("id","val1");

        request.getRequestDispatcher("/adminProduct.jsp").forward(request,response);

    }
}
