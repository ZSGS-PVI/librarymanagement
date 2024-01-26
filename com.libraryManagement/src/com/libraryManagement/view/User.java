package com.libraryManagement.view;

import java.util.Scanner;

import com.libraryManagement.Model.UserInfo;
import com.libraryManagement.ViewModel.LibraryOperation;




public class User  {
	
	 private LibraryOperation libraryOperation;

	    public User() {
	      

	    	LibraryOperation libraryOperation = new LibraryOperation(this);
	    }

	public void start() {
		boolean running=true;
		Scanner in=new Scanner(System.in);
		while(running) {
			System.out.println("1.Add User\n2. View User\n3. Update User\n4. Delete User\n5. Exit");
			int value=in.nextInt();
			switch(value) {
			
			case 1:
				AddUser();
				break;
//			case 2:
//				ViewUser();
//				break;
//				
//			case 3:
//				UpdateUser();
//				 break;	
//				
//			case 4:
//				DeleteUser();
//				 break;
			case 5:  System.out.println("Thank you!");
            running = false;
            break;
            
           default:
            System.err.println("Invalid option. Please try again.");
            break;
				
				
			       
			}
		}
	}
	
	private void AddUser() {
		Scanner in=new Scanner(System.in);
		int rollNo = 0;
		String name;
		String Age;
		String mobileno;
		String email;
		String place;

		while (true) {
			System.out.println("Enter the rollNo  (type '0' to stop adding names):");
			rollNo = in.nextInt();
			if (rollNo == 0) {
				break;
			}

			System.out.println("Enter  User name:");
			name = in.next();
		    libraryOperation.isValidName(name);

			System.out.println("Enter Age ");
			Age= in.next();
			
			System.out.println("Enter mobileno: ");
			mobileno = in.next();
			libraryOperation.isValidMobileNo(mobileno);

			System.out.println("Enter email  ");
			email = in.next();
			libraryOperation.isValidEmail(email);
			
			System.out.println("Enter Place  ");
			place = in.next();

			UserInfo userinfo = new UserInfo(rollNo, name, Age, mobileno, email,place);
			  libraryOperation.validate(userinfo);

		}
	}
	private void onSuccess() {
		System.out.println("User details inserted successfully!");


		
	}

}
