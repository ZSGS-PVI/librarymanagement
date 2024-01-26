package com.libraryManagement.view;

import java.util.Scanner;

import com.libraryManagement.ViewModel.LibraryOperation;

public class LibraryMain {
	private LibraryOperation libraryOperation;

	public LibraryMain() {
		super();
		 libraryOperation=new LibraryOperation();
	}

	public static void main(String[] args) {
		
     LibraryMain library=new LibraryMain();
     library.init();
	}
	private void init() {
		boolean running=true;
		Scanner in=new Scanner(System.in);
		while(running) {
			System.out.println("1.Login\n2. Create Account\n3. UserPortal\n4. BookPortal\n5. Exit");
			int value=in.nextInt();
			switch(value) {
			
			case 1:
				login();
				break;
			case 2:
				createAccount();
				break;
				
			case 3:
				User user=new User();
				 user.start();
				 break;	
				
//			case 4:
//				 Book book=new Book();
//				 book.start();
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

	private void createAccount() {
		// TODO Auto-generated method stub
		
	}

	private void login() {
		// TODO Auto-generated method stub
		
	}

}
