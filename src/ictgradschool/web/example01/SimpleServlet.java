package ictgradschool.web.example01;

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
 * Gets articles and prints out some HTML to display them.
 */
@WebServlet(name = "SimpleServlet", urlPatterns = {"/simpleservlet"})
// This servlet class will be run for web requests matching the /simpleservlet URL.
public class SimpleServlet extends HttpServlet {

    /**
     * When a GET request is made to /simpleservlet, this method will be run.
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

        // If we want to iterate through all parameters, we can use getParameterMap.
        // This code here will just print all the request parameters to the console, no matter how many or what they are.
        Map<String, String[]> params = request.getParameterMap();
        for (String key : params.keySet()) {

            String[] values = params.get(key);

            System.out.println("Values for key '" + key + "':");
            for (String value : values) {
                System.out.println("- " + value);
            }
        }

        request.setAttribute("firstName", firstName);
        request.setAttribute("lastName", lastName);
        request.setAttribute("animals", Arrays.toString(favoriteAnimals));

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/example01/example01.jsp");
        dispatcher.forward(request, response);
    }

    /**
     * When a POST request is made to /simpleservlet, this method will be run.
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
