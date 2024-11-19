package com.xworkz.userService;

import com.xworkz.userDTO.UserDTO;
import com.xworkz.userRepo.UserRepoImpl;
import com.xworkz.userRepo.UserRepository;

public class UserServiceImpl implements UserService {
	    private UserRepository userRepository;

	    public UserServiceImpl() {
	        this.userRepository = new UserRepoImpl();
	    }

	    @Override
	    public boolean validateAndSave(UserDTO userDTO) {
	        boolean valid = true;

	        if (userDTO != null) {
	            String name = userDTO.getName();
	            if (name != null && name.length() > 6 && name.length() < 14) {
	                System.out.println("Name is valid");
	            } else {
	                System.err.println("Name is invalid");
	                valid = false;
	            }

	            String phoneNumber = userDTO.getPhoneNumber();
	            if (phoneNumber != null && phoneNumber.length() == 10 && phoneNumber.startsWith("9")) {
	                System.out.println("Phone number is valid");
	            } else {
	                System.err.println("Phone number is invalid");
	                valid = false;
	            }

	            String email = userDTO.getEmail();
	            if (email != null && email.contains("@gmail.com") && email.indexOf('@') == 8 && email.matches(".[A-Z].")) {
	                System.out.println("Email is valid");
	            } else {
	                System.err.println("Email is invalid");
	                valid = false;
	            }

	            int age = userDTO.getAge();
	            if (age > 5) {
	                System.out.println("Age is valid");
	            } else {
	                System.err.println("Age is invalid");
	                valid = false;
	            }

	            if (valid) {
	                System.out.println("UserDTO is valid, saving to repository");
	                userRepository.save(userDTO);
	            }
	        }
	        return valid;
	    }

		
	}

