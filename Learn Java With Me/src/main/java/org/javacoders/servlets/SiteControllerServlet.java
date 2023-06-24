package org.javacoders.servlets;

import java.io.IOException;

import org.javacoders.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/java-coders")
public class SiteControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = request.getParameter("page").toLowerCase();
		switch(page) {
		case "home":{
			User user = (User)request.getSession().getAttribute("user");
			if(user == null) {
				indexPage(request, response);
			}
			else {
				homePage(request, response);
			}
			break;
		}
		case "docs":{
			break;
		}
		case "questions":{
			break;
		}
		case "achievements":{
			break;
		}
		case "about-me":{
			break;
		}
		case "sign-in":{
			signInPage(request, response);
			break;
		}
		case "sign-up":{
			signUpPage(request, response);
			break;
		}
		case "sign-out":{
			signOut(request, response);
			break;
		}
		}
	}

	private void signUpPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("title", "Sign Up");
		request.getRequestDispatcher("sign-up.jsp").forward(request, response);
	}

	private void signInPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("title", "Sign In");
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	private void homePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("title", "Welcome Java Learning");
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}
	
	private void indexPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("title", "Welcome Java Learning");
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
	
	private void signOut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("title", "Welcome Java Learning");
		request.getSession().setAttribute("user", null);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
