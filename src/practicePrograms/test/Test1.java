package practicePrograms.test;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		
		List<User> userList = new ArrayList<>();
		userList.add(new User("Suresh", "sureshchandak1@gmail.com"));
		userList.add(new User("Suresh", "sureshchandak1@gmail.com"));
		userList.add(new User("Suresh", "sureshchandak1@gmail.com"));
		userList.add(null);
		userList.add(new User("Suresh", "sureshchandak1@gmail.com"));
		userList.add(new User("Suresh", "sureshchandak1@gmail.com"));
		userList.add(new User("Suresh", "sureshchandak1@gmail.com"));
		
		for (User user : userList) {
			
			try {
				user.getName();
				user.getEmail();
				System.out.println("------");
			}
			catch(NullPointerException e) {
				System.out.println("NullPointerException -----");
			}
			
		}
		
		
		System.out.println("\n\n\n");
		
		try {
			
			for (User user : userList) {
				user.getName();
				user.getEmail();
				System.out.println("------");
			}
			
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException -----");
		}

	}
	
	private static class User {
		
		private String name;
		private String email;
		
		public User(String name, String email) {
			this.name = name;
			this.email = email;
		}
		
		public String getName() {
			return name;
		}
		
		public String getEmail() {
			return email;
		}
		
	}

}
