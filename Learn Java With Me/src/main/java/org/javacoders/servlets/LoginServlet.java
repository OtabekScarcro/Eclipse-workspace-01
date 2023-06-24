package org.javacoders.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.sql.DataSource;

import org.javacoders.control.UserControl;
import org.javacoders.model.User;

import jakarta.annotation.Resource;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/user-login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource(name="jdbc/project")
	private static DataSource dataSource;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try(PrintWriter out = response.getWriter()){
			String userEmail = request.getParameter("login-email");
			String userPassword = request.getParameter("login-password");
			
			UserControl userControl = new UserControl(dataSource);
			User user = userControl.checkLoginDetails(userEmail, userPassword);
			if(user != null) {
				request.getSession().setAttribute("user", user);
				request.getRequestDispatcher("home.jsp").forward(request, response);
			}
			else {
				request.setAttribute("errorMessage", "loginFailed");
				request.getRequestDispatcher("errorPage.jsp").forward(request, response);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
