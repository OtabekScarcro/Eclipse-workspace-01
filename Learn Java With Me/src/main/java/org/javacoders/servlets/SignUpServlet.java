package org.javacoders.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.sql.DataSource;
import org.javacoders.control.UserControl;
import org.javacoders.model.User;

import jakarta.annotation.Resource;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/user-signup")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource(name="jdbc/project")
	private static DataSource dataSource;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try(PrintWriter out = response.getWriter()){
			String username = request.getParameter("username");
			String userEmail = request.getParameter("userEmail");
			String userPassword = request.getParameter("userPassword");
			
			UserControl userControl = new UserControl(dataSource);
			User user = new User(username, userEmail, userPassword);
			String checking = userControl.checkNewUserDetails(user);
			if(checking.equals("notSuccessful")) {
				request.setAttribute("errorMessage", "Something wentvfvf wrong!");
				request.getRequestDispatcher("errorPage.jsp").forward(request, response);
			}
			else if(!checking.equals("successful")) {
				request.setAttribute("errorMessage", checking);
				request.getRequestDispatcher("errorPage.jsp").forward(request, response);
			}
			else {
				boolean result = userControl.newUser(user);
				if(result) {
					request.getSession().setAttribute("user", user);
					request.getRequestDispatcher("home.jsp").forward(request, response);
				}
				else {
					request.setAttribute("errorMessage", "Something went wrong!");
					request.getRequestDispatcher("errorPage.jsp").forward(request, response);
				}
			}
		}
	}
}
