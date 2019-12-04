package controller;

import data.DataCustomers;
import model.Customers;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomersServlet", urlPatterns = "/")
public class CustomersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getServletPath();
        switch (action) {
            case "/new":
                break;
            case "/delete":
                deleteCustomerById(request,response);
                break;
            case "edit":
                break;
            default:
                listCustomer(request,response);
                break;
        }
    }

    //phương thức để lấy về dữ liệu  và trả về trang list
    private void listCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customers> customersList = DataCustomers.getAllCustomers();
        request.setAttribute("customersList", customersList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/index.jsp");
        dispatcher.forward(request, response);
    }

    //phương thức delete khách hàng theo id
    private void deleteCustomerById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idCustomer = Integer.parseInt(request.getParameter("customerId"));
        DataCustomers.deleteCustomer(idCustomer);
        response.sendRedirect("/list");
    }
}
