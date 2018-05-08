package webapp;

import webapp.appLayer.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Login")
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User userObject = new User();
        request.setAttribute("username",request.getParameter("loginName"));
        request.setAttribute("password",request.getParameter("password"));
    if (userObject.isValidUserCredentials(request.getParameter("loginName"),request.getParameter("password"))){

        request.getRequestDispatcher("/welcome.jsp").forward(request,response);

    } else {
        request.setAttribute("errorMessage","Invalid Login and password,try Again.");
        request.getRequestDispatcher("/login.jsp").forward(request,response);
    }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("login name" + request.getParameter("loginName") + "Password" + request.getParameter("password"));
    }
}
