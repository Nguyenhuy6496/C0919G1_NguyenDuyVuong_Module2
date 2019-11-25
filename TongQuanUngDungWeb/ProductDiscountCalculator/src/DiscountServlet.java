import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", urlPatterns = "/demo")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("price"));
        float discount = Float.parseFloat(request.getParameter("discount_percent"));
        float amount = (float) (price * discount * 0.1);
        float result = price - amount;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Product Discount Calculator</h1>");
        writer.println("<label>Product Description: </label>");
        writer.println("<span>" + description + "</span><br/>");
        writer.println("<label>Price: </label>");
        writer.println("<span>" + price + "</span><br/>");
        writer.println("<label>Discount Percent: </label>");
        writer.println("<span>" + discount + "%" + "</span><br/>");
        writer.println("<label>Discount Amount: </label>");
        writer.println("<span>" + "$" + amount + "</span><br/>");
        writer.println("<label>Discount Price: </label>");
        writer.println("<span>" + "$" + result + "</span><br/>");
        writer.println("<html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
