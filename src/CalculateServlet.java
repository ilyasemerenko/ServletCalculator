import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/calculator")
public class CalculateServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        /*CalculatorAction calc = new CalculatorAction();
        String result = null;
        try {
            result = String.valueOf(calc.getResult(req));
        } catch (Exception e) {
            e.printStackTrace();
            result = "You've entered wrong values or operation";
        }
        req.setAttribute("result", result);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/counter.jsp");
        try {
            dispatcher.forward(req,res);
        } catch (ServletException e) {
            e.printStackTrace();
        }*/

        List<User> users = new ArrayList<>();

        users.add(new User("Jeremy",34));
        users.add(new User("James", 23));
        users.add(new User("Richard",13));
        users.add(new User("Emma",17));
        users.add(new User("Judy",21));

        req.setAttribute("users", users);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/users.jsp");
        try {
            dispatcher.forward(req,res);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }


}
