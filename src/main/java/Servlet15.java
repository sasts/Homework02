import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

@WebServlet("/Servlet15")
public class Servlet15 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=utf-8");
        Random random = new Random();
        int[] numbers = new int[10];
        for(int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(100) +1;

        }
        response.getWriter().append("<table border=\"1\">")
                .append("<tr>").append("<th>Numbers</th>").append("</tr>")
                .append("<tr>").append("<td>").append(Arrays.toString(numbers)).append("</td>").append("</tr>")
                .append("</table>");
        Arrays.sort(numbers);
        response.getWriter().append("<table border=\"1\">")
                .append("<tr>").append("<th>Sorted numbers</th>").append("</tr>")
                .append("<tr>").append("<td>").append(Arrays.toString(numbers)).append("</td>").append("</tr>")
                .append("</table>");

    }
}
