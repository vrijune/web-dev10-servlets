package ictgradschool.web.example02;

import ictgradschool.web.util.JSONResponse;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/**
 * Gets articles and prints out some JSON to display them.
 */
@WebServlet(name = "Json", urlPatterns = {"/jsonservlet"})
public class JsonServlet extends HttpServlet {

    /**
     * When a GET request is made to /jsonservlet, this method will be run.
     *
     * @param request  tells us information about the request, such as any submitted data.
     * @param response allows us to send info back to the browser
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        // Get request parameters (i.e. from form submission, query string, etc).
        // getParameter is useful to get a single value for a known parameter, e.g. a textbox on a form.
        String firstName = request.getParameter("firstname");
        String lastName = request.getParameter("lastname");

        // getParameterValues is useful to get multiple values for a single known parameter, e.g. multiple checkboxes with the same name.
        String[] favoriteAnimals = request.getParameterValues("animals");

        // Create a Person object
        Person person = new Person(firstName, lastName, favoriteAnimals);

        // Send the Person as JSON back to the browser.
        JSONResponse.send(response, person);
    }

    /**
     * When a POST request is made to /jsonservlet, this method will be run.
     * <p>
     * In this case, the method just calls doGet, meaning that for this servlet, GET and POST requests are handled
     * in the same way.
     *
     * @param request  tells us information about the request, such as any submitted data.
     * @param response allows us to send info back to the browser
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
