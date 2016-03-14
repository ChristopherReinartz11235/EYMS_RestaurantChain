package Password;

import java.util.Scanner;
import javax.swing.JPasswordField;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username: ");
		String username = sc.nextLine();
		JPasswordField password = new JPasswordField(5);
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password: ");
		char [] pass = password.getPassword();
		PasswordTest me = new PasswordTest(username,password);
	}
}
