package com.xworkz.mobileRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.mobileDTO.MobileDTO;

public class MobileRepoImpl implements MobileRepo{
	public boolean save(MobileDTO mobileDTO) {

		boolean isValid = false;
		try {
			Connection connection = null;
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobilephone", "root", "xworkzodc");


			PreparedStatement preparedStatement = null;

			preparedStatement = connection.prepareStatement("insert into mobilephone_details values(?, ?, ?, ?)");


			preparedStatement.setString(1, mobileDTO.getName());
			preparedStatement.setString(2, mobileDTO.getEmail());
			preparedStatement.setInt(3, mobileDTO.getAge());
			preparedStatement.setString(4, mobileDTO.getPhNo());

			int value = preparedStatement.executeUpdate();

			if(value > 0) {
				System.out.println("Data is saved");
				isValid = true;
			}else {
				System.out.println("Data is not saved");
				isValid = false;
			}

		}catch(SQLException e) {
			e.printStackTrace();
		}


		return isValid;

	}

	public List<String> getNameByAge(int age) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		String name = null;

		List<String> list = new ArrayList<>();

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobilephone", "root", "xworkzodc");
			preparedStatement = connection.prepareStatement("select name from mobilephone_details where age > ?");

			preparedStatement.setInt(1, age);

			ResultSet resulSet = preparedStatement.executeQuery();
			while(resulSet.next()) {
				list.add(resulSet.getString("name"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}


	public String getEmailByName(String name) {

		String email = null;
		PreparedStatement preparedStatement = null;
		Connection connection = null;

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobilephone", "root", "xworkzodc");

			preparedStatement = connection.prepareStatement("select email from mobilephone_details where name = ?");
			preparedStatement.setString(1, email);
			ResultSet set = preparedStatement.executeQuery();
			while(set.next()) {
				set.getString("email");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}

		return email;
	}


	public String getNameByEmail(String email) {
		String name = null;
		PreparedStatement preparedStatement = null;
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobilephone", "root", "xworkzodc");

			preparedStatement = connection.prepareStatement("select name from mobilephone_details where email = ?");

			preparedStatement.setString(1, name);
			ResultSet set = preparedStatement.executeQuery();

			while(set.next()) {
				set.getString("name");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}

		return name;
	}
}


