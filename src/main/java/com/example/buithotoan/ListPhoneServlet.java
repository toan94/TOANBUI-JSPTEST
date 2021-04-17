package com.example.buithotoan;

import com.example.buithotoan.Dao.PhoneDao;
import com.example.buithotoan.models.Phone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListPhoneServlet", value = "/ListPhone")
public class ListPhoneServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PhoneDao pDao = new PhoneDao();
        List<Phone> allPhones = pDao.getAllPhones();

        request.setAttribute("allPhones", allPhones);

        RequestDispatcher rd=request.getRequestDispatcher("/listPhone.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
