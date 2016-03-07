package hsenid;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class LoginHandle extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request,
                      HttpServletResponse response) throws IOException, ServletException {


        String username = request.getParameter("txtUn");
        String password = request.getParameter("txtPw");

        if (username.equals("admin") && password.equals("123")) {
            response.sendRedirect("success.html");
        } else {
            response.sendRedirect("error.html");
        }
    }

}
