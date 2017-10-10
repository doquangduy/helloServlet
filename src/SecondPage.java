import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SecondPage extends HttpServlet {
    public void init() {
        ;
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter write = response.getWriter();

        write.write("<h1>Hello SecondPage</h1>");
    }

    public void destroy() {
        ;
    }
}
