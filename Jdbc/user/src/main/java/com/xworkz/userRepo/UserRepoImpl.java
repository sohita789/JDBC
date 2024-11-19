package com.xworkz.userRepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.userDTO.UserDTO;

public class UserRepoImpl implements UserRepository {
	    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/userData";
	    private static final String JDBC_USER = "username";
	    private static final String JDBC_PASSWORD = "password";

	    @Override
	    public boolean save(UserDTO userDTO) {
	        String sql = "INSERT INTO user_details (id,name, phone_number, email, age) VALUES (?, ?, ?, ?, ?)";
	        try {
	            Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
	            PreparedStatement preparedStatement = connection.prepareStatement(sql);
	            
	            preparedStatement.setString(1, userDTO.getName());
	            preparedStatement.setString(2, userDTO.getPhoneNumber());
	            preparedStatement.setString(3, userDTO.getEmail());
	            preparedStatement.setInt(4, userDTO.getAge());

	            int rowsInserted = preparedStatement.executeUpdate();
	            preparedStatement.close();
	            connection.close();

	            return rowsInserted > 0;
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }

		
		
	}


