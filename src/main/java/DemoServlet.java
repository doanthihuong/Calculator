import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DemoServlet", urlPatterns = "/mayTinh")
public class DemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        double first = Double.parseDouble(request.getParameter("a"));
        double second = Double.parseDouble(request.getParameter("b"));
        String operator = request.getParameter("ope");
        double result = 0;
        System.out.println(first);
        System.out.println(second);
        if (operator.equals("+")) {
            result = first + second;
            request.setAttribute("cong","selected");
        } else if (operator.equals("-")) {
            result = first - second;
            request.setAttribute("tru","selected");
        } else if (operator.equals("*")) {
            result = first * second;
            request.setAttribute("nhan","selected");
        } else if(operator.equals("/")){
            result = first/second;
            request.setAttribute("chia","selected");
        }



        System.out.println(result);
        request.setAttribute("r", result);
        request.setAttribute("first",first);
        request.setAttribute("second",second);

        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
    }
}
