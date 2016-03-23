import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calculator")
public class Servlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        Calculator calc = new Calculator();
        PrintWriter writer = res.getWriter();
        String result = null;
        try {
            result = String.valueOf(calc.getResult(req));
        } catch (Exception e) {
            e.printStackTrace();
            result = "You've entered wrong values or operation";
        }
        writer.write("Hello from server! Your result is: " + result);
    }

}
