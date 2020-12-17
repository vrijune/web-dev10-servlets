package ictgradschool.web.exercise03;

import ictgradschool.web.util.JSONResponse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.List;


@WebServlet(name = "LecturerEndpoint", urlPatterns = {"/lecturersendpoint"})
public class LecturerEndPoint extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       Lecturer[] lecturers= LecturerDataAccess.getLecturersArray();
        JSONResponse.send(response, lecturers);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
