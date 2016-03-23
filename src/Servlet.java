import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by SemerenkoIlya on 21.03.2016.
 */
@WebServlet("/calculator")
public class Servlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        Calculator calc = new Calculator();
        PrintWriter writer = res.getWriter();
        writer.write("Hello from server! Your result is: " + calc.getResult(req));
    }

}
