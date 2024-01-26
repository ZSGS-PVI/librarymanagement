package com.libraryManagement.Model.Repo;

import java.util.HashMap;
import java.util.Map;

import com.libraryManagement.Model.UserInfo;

public class LibraryRepo {
	private static LibraryRepo repository; 
	private Map<String,UserInfo> map=new HashMap<>();
	
	public LibraryRepo() {
		
		
	}
	
	public static  LibraryRepo getInstanse() {
		if (repository == null) {
			repository = new  LibraryRepo();
		}
		return repository;
	}
	
	  public void addUser(UserInfo user) {
	        map.put(user.getEmail(), user); 
	        
	    }
	  public Map<String, UserInfo> getAllUsers() {
	        return map;
	    }

}
