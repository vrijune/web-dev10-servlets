package ictgradschool.web.exercise02;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;




@WebServlet(name = "Exercise02Servlet", urlPatterns = {"/exercise02"})
public class exercise02 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String number1 = request.getParameter("number1");
        String number2 = request.getParameter("number2");
        String number3  = request.getParameter("number3");
        String number4 = request.getParameter("number4");

       int number5 = Math.max(Math.max(Integer.parseInt(number1),Integer.parseInt(number2)),Math.max(Integer.parseInt(number3),Integer.parseInt(number4)));

        int number6 = Math.max(Math.max(Integer.parseInt(number1),Integer.parseInt(number2)),Math.min(Integer.parseInt(number3),Integer.parseInt(number4)));
        int number7 = Math.min(Math.max(Integer.parseInt(number1),Integer.parseInt(number2)),Math.max(Integer.parseInt(number3),Integer.parseInt(number4)));
        int number8 = Math.min(Math.min(Integer.parseInt(number1),Integer.parseInt(number2)),Math.min(Integer.parseInt(number3),Integer.parseInt(number4)));

        request.setAttribute("first", number8 );
        request.setAttribute("second", number7);
        request.setAttribute("third", number6);
        request.setAttribute("fourth",  number5);



        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/exercise02/exercise02.jsp");
        dispatcher.forward(request, response);

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doGet(request, response);
    }
}
