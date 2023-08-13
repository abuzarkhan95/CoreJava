import java.util.Scanner;

class Login {
	private String name;
	private String pass;

	void login() {
		String name = "Abuzar";
		String pass = "user@";
		this.name = name;
		this.pass = pass;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Name");
		String newName = scanner.nextLine();
		System.out.println("Enter your Pass");
		String newPass = scanner.nextLine();
		if (name.equalsIgnoreCase(newName) && pass.equals(newPass)) {
			System.out.println("Congratulations Login Successfully...");
		} else {
			String NewUser = "UserName:" + newName + " & pass:" + newPass;
			System.out.println("Login Failed...\n" + "NewUserLogin..>" + NewUser);
		}
		scanner.close();
	}
}

class LoginUser {
	public static void main(String[] args) {
		Login log = new Login();
		log.login();
	}
}