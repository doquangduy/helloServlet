import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class HelloWorld extends HttpServlet {
    public void init() {
        ;
    }

    public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        List<String> lines = Files.readAllLines(Paths.get("index.html", "utf-8"));
        response.setContentType("text/html");

        for(String line:lines)
        {
            out.write(line);
        }

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
