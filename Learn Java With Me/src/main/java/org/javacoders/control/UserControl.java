package org.javacoders.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.javacoders.model.User;

public class UserControl {
	private Connection con;
	private String query;
	private PreparedStatement pst;
	private ResultSet rs;
	
	/**
	 * Constructor 
	 * @param con	Connection with database
	 */
	public UserControl(DataSource dataSource) {
		try {
			this.con = dataSource.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * checking new User Details
	 * @param user
	 * @return
	 */
	public String checkNewUserDetails(User user) {
		try {
			query = "select * from users";
			pst = this.con.prepareStatement(query);
			rs = pst.executeQuery();
			while(rs.next()) {
				if(rs.getString("u_email") == user.getEmail()) {
					return "sameEmail";
				}
				if(!isStrongPassword(user.getPassword())) {
					return "notStrongPassword";
				}
			}
			return "successful";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "notSuccessful";
	}
	
	/**
	 * check password if it is Strong
	 * @param password
	 * @return
	 */
	private boolean isStrongPassword(String password) {
		if(password.length() >= 8) {
			return true;
		}
		return false;
	}

	public User checkLoginDetails(String email, String password) {
		User user = null;
		try {
			query = "select * from users where u_email=? and u_password=?";
			pst = this.con.prepareStatement(query);
			pst.setString(1, email);
			pst.setString(2, password);
			rs = pst.executeQuery();
			while(rs.next()) {
				user = new User();
				user.setId(rs.getInt("u_id"));
				user.setName(rs.getString("u_name"));
				user.setEmail(rs.getString("u_email"));
				user.setPassword(rs.getString("u_password"));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	/**
	 * Adding new User to database
	 * @param username
	 * @param userEmail
	 * @param userPassword
	 * @return
	 */
	public boolean newUser(User user) {
		try {
			query = "insert into users (u_name, u_email, u_password) values(?,?,?)";
			
			pst = this.con.prepareStatement(query);
			pst.setString(1, user.getName());
			pst.setString(2, user.getEmail());
			pst.setString(3, user.getPassword());
			pst.executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	
	/**
	 * getting all users from Database
	 * @return
	 */
	public List<User> getAllUsers(){
		List<User> usersList = new ArrayList<>();
		try {
			query = "select * from users";
			pst = this.con.prepareStatement(query);
			rs = pst.executeQuery();
			while(rs.next()) {
				User user = new User();
				user.setId(rs.getInt("u_id"));
				user.setName(rs.getString("u_name"));
				user.setEmail(rs.getString("u_email"));
				user.setPassword(rs.getString("u_password"));
				usersList.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usersList;
	}
}
