package ictgradschool.web.exercise1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;


@WebServlet(name = "Exercise01Servlet", urlPatterns = {"/exercise01"})

public class Exercise01 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String age  = request.getParameter("age");
        String placeOfBirth = request.getParameter("placeOfBirth");
        String biography = request.getParameter("biography");

        request.setAttribute("firstName", firstName);
        request.setAttribute("lastName", lastName);
        request.setAttribute("age", age);
        request.setAttribute("placeOfBirth",  placeOfBirth);
        request.setAttribute("biography", biography);


        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/exercise01/exercise01.jsp");
        dispatcher.forward(request, response);

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
