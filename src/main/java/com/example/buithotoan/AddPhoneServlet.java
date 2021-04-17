package com.example.buithotoan;

import com.example.buithotoan.Dao.PhoneDao;
import com.example.buithotoan.models.Phone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AddPhoneServlet", value = "/AddPhone")
public class AddPhoneServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        RequestDispatcher rd=request.getRequestDispatcher("/addPhone.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String brand = request.getParameter("brand");
        String description = request.getParameter("description");
        String priceString = request.getParameter("price");


        boolean wrongStatus = name.isEmpty()
                || brand.isEmpty()
                || description.isEmpty()
                || priceString.isEmpty();

        if (wrongStatus) {
            request.setAttribute("wrongStatus", wrongStatus);
            doGet(request, response);
            return;
        }

        int price = Integer.parseInt(request.getParameter("price"));
        Phone newP = new Phone(name, brand, description, price);

        PhoneDao pDao = new PhoneDao();
        pDao.createPhone(newP);

        response.sendRedirect(request.getContextPath() + "/ListPhone");


    }
}
