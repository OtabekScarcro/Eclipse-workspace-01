package org.javacoders.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.javacoders.entity.User;

public class UsersModel {
	public List<User> listUsers(DataSource dataSource){
		List<User> listUsers = new ArrayList<>();
		
		// step 1: Initialize connection Objects
		Connection connect = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			connect = dataSource.getConnection();
			
			// step 2: Create a SQL statement String
			String query = "select * from users.new_table";
			stmt = connect.createStatement();
			
			// step 3: Execute query statement
			rs = stmt.executeQuery(query);
			
			// step 4: Process the result set
            while(rs.next()){
            	listUsers.add(new User(rs.getInt("users_id"), rs.getString("username"), rs.getString("email")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listUsers;
	}

	/**
	 * Adding a new User to the Database
	 * @param dataSource
	 * @param newUser
	 */
	public void addUser(DataSource dataSource, User newUser) {
		Connection connect = null;
		PreparedStatement statement = null;
		try {
			connect = dataSource.getConnection();
			String username = newUser.getUsername();
			String email = newUser.getEmail();
			String query = "insert into new_table (username, email) values(?,?)";
			statement = connect.prepareStatement(query);
			statement.setString(1, username);
			statement.setString(2, email);
			statement.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Updating a particular user's data
	 * @param dataSource
	 * @param updatedUser
	 */
	public void updateUser(DataSource dataSource, User updatedUser) {
		Connection connect = null;
		PreparedStatement statement = null;
		try {
			connect = dataSource.getConnection();
			int usersId = updatedUser.getUsers_id();
			String username = updatedUser.getUsername();
			String email = updatedUser.getEmail();
			String query = "update new_table set username=?, email=? where users_Id=?";
			statement = connect.prepareStatement(query);
			statement.setString(1, username);
			statement.setString(2, email);
			statement.setInt(3, usersId);
			statement.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Deleting a particular user from the Database
	 * @param usersId
	 */
	public void deleteUser(DataSource dataSource, int usersId) {
		Connection connect = null;
		PreparedStatement statement = null;
		try {
			connect = dataSource.getConnection();
			String query = "delete from new_table where users_Id=?";
			statement = connect.prepareStatement(query);
			statement.setInt(1, usersId);
			statement.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}


















