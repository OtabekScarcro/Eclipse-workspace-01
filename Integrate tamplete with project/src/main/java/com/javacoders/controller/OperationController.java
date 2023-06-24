package com.javacoders.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.javacoders.entity.User;
import org.javacoders.model.UsersModel;

import jakarta.annotation.Resource;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/operation")
public class OperationController extends HttpServlet {
	private static final long serialVersionUID = 1L;	
	
	@Resource(name="jdbc/project")
	private DataSource dataSource;
	
	/**
	 * Do Get Method
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = request.getParameter("page").toLowerCase();
		switch(page) {
		case "listusers":{
			listUsers(request, response);
			break;
		}
		case "adduser":{
			addUserFormLoader(request, response);
			break;
		}
		case "updateuser":{
			updateUserFromLoader(request, response);
			break;
		}
		case "deleteuser":{
			deleteUser(Integer.parseInt(request.getParameter("usersId")));
			listUsers(request, response);
			break;
		}
		default:
			errorPage(request, response);
		}
	}
	
	/**
	 * 
	 * @param parseInt
	 */
	private void deleteUser(int usersId) {
		new UsersModel().deleteUser(dataSource, usersId);
		return;
	}

	/**
	 * updating a particular user from list
	 * @param request
	 * @param response
	 */
	private void updateUserFromLoader(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("title", "Update User");
		try {
			request.getRequestDispatcher("updateUser.jsp").forward(request, response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Do Post Method
	 */

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operation = request.getParameter("form").toLowerCase();
		switch(operation) {
		case "adduseroperation":{
			User newUser = new User(request.getParameter("username"), request.getParameter("email"));
			addUserOperation(newUser);
			listUsers(request, response);
			break;
		}
		case "updateuseroperation":{
			User updatedUser = new User(Integer.parseInt(request.getParameter("usersId")), 
					request.getParameter("username"), request.getParameter("email"));
			updateUserOperation(dataSource, updatedUser);
			listUsers(request, response);
			break;
		}
		default :
			errorPage(request, response);
			break;
		}
	}
	
	/**
	 * Operator method to update user
	 * @param dataSource
	 * @param updatedUser
	 */
	private void updateUserOperation(DataSource dataSource, User updatedUser) {
		new UsersModel().updateUser(dataSource, updatedUser);
		return;
	}

	/**
	 * Operator method to add new user
	 * @param newUser
	 */
	private void addUserOperation(User newUser) {
		new UsersModel().addUser(dataSource, newUser);
		return;
	}

	/**
	 * Method to show list of users
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void listUsers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<User> listUsers = new ArrayList<>();
		listUsers = new UsersModel().listUsers(dataSource);
		request.setAttribute("listUsers", listUsers);
		request.setAttribute("title", "List of Users");
		request.getRequestDispatcher("listUsers.jsp").forward(request, response);
	}
	
	/**
	 * forwarding to new User page
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void addUserFormLoader(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("title", "New User");
		request.getRequestDispatcher("adduser.jsp").forward(request, response);
	}
	
	/**
	 * Forwarding to Error page
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void errorPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("title", "Error page");
		request.getRequestDispatcher("error.jsp").forward(request, response);
	}
}














