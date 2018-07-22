package constants;

public interface AppLevelConstants {
	enum UserFields{
		userId,
		userName,
		password,
	}
	String SUCCESS = "Login Succesful";
	String INCORRECT_USERNAME = "Please enter correct username!!";
	String INCORRECT_PASSWORD = "Please enter correct password!!";
	String USERNAME_EMPTY = "Username can't be empty";
	String PASSWORD_EMPTY="Password can't be empty";
}
