package B_Intermediate.C_InterfacesAbstractAndInnerClasses.D_NestedClasses;

public class LocalTypeInnerClass {

	public void login(User user) {
		
		class UserService {
			
			private User user;

			public UserService(User user) {
				this.user = user;
			}			
			
			public boolean validateUsernameAndPassword() {
				return user.username == "Admin" && user.password == "1234";
			}
		}
		
		UserService userService = new UserService(user);
		if (userService.validateUsernameAndPassword()) {
			System.out.println("Logged in successfully!");
		} else {
			System.out.println("Username or password is wrong!");
		}
	}
	
	class User {
		private String username;
		private String password;
		
		public User(String username, String password) {
			this.username = username;
			this.password = password;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
	}
}
