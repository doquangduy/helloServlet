import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWorld extends HttpServlet {
    public void init() {
        ;
    }

    public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.write("<h1>Hello World</h1>");
        out.write("<form method=\"post\" action=\"/HelloWorld\">" +
                    "<input type=\"text\" name=\"name\">" +
                    "<input type=\"submit\">");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.write(request.getParameter("name"));
    }

    public void destroy() {
        ;
    }
}
