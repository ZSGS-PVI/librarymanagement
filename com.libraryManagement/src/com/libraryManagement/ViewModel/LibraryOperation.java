package com.libraryManagement.ViewModel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.libraryManagement.Model.UserInfo;
import com.libraryManagement.Model.Repo.LibraryRepo;
import com.libraryManagement.view.LibraryMain;
import com.libraryManagement.view.User;

public class LibraryOperation {
	
	
	private User user;
	public LibraryOperation(User user) {
	
		this.user = user;
	}
	public LibraryOperation() {
		// TODO Auto-generated constructor stub
	}
	public void validate(UserInfo userinfo) {
	LibraryRepo.getInstanse().addUser(userinfo);
	
		
}

	

	// student name validation
	public void isValidName(String name) {

		if (name.matches("^[a-zA-Z]+$")) {
		}

		else {
			System.err.println("only characters are allowed!");
			//addStudent.addStudentInfo();
		}

	}

	// student DOB validation
	public void isValidDateOfBirth(String dateStr) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);

		try {
			Date date = dateFormat.parse(dateStr);

			Date currentDate = new Date();

			if (!date.after(currentDate) && date.before(currentDate)) {

			}
		} catch (ParseException e) {
			// ParseException will be thrown if the date format is invalid
			System.err.println("Invalid date of birth!");
			//addStudent.addStudentInfo();

		}
	}

	// student Mobile number validation

	public void isValidMobileNo(String number) {

		if (number != null && !number.isEmpty()) {

			if (number.matches("^[0-9]{10}$")) {

			} else {
				System.err.println("Invalid mobile number! Only 10 digits are allowed.");
				//addStudent.addStudentInfo();
			}
		} else {
			System.err.println("Mobile number cannot be empty or null!");
			//addStudent.addStudentInfo();
		}
	}

	// student Email validation
	public void isValidEmail(String name) {

		if (name != null && !name.isEmpty()) {

			if (name.matches(
					"^[A-Za-z0-9-\\+]+(\\.[A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {

			}

			else {
				System.err.println("Invalid Email Id!");
				//addStudent.addStudentInfo();
			}

		} else {
			System.err.println("Email Id cannot be empty or null!");
			//addStudent.addStudentInfo();
		}

	}

	


}
