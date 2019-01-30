import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

@WebServlet("/Servlet13")
public class Servlet13 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=utf-8");
        File file = new File("/Users/magda/Homework02/src/main/java/oop.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            response.getWriter().append(scanner.next()).append("<br>");
        }

    }
}
