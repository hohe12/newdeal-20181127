import java.sql.Date;
import java.util.Scanner;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App2 {

	public static void main(String[] args) {
		final int DEFAULT_SIZE = 20;
		int[] no = new int[DEFAULT_SIZE];
		String[] name = new String[DEFAULT_SIZE];
		String[] email = new String[DEFAULT_SIZE];
		String[] password = new String[DEFAULT_SIZE];
		String[] image = new String[DEFAULT_SIZE];
		String[] phone = new String[DEFAULT_SIZE];
		Date[] registeredDate = new Date[DEFAULT_SIZE];
		int len = 0;

		Scanner keyIn = new Scanner(System.in);

		for (int i = 0; i < DEFAULT_SIZE; i++) {

			System.out.println("번호? ");
			no[i] = Integer.parseInt(keyIn.nextLine());

			System.out.print("이름? ");
			name[i] = keyIn.nextLine();

			System.out.print("이메일? ");
			email[i] = keyIn.nextLine();

			System.out.print("암호? ");
			password[i] = keyIn.nextLine();

			System.out.print("사진? ");
			image[i] = keyIn.nextLine();

			System.out.println("전화? ");
			phone[i] = keyIn.nextLine();

			registeredDate[i] = new Date(System.currentTimeMillis());
		     
			len++;

			System.out.print("계속하시곘습니까?(Y/n) ");
			String input = keyIn.nextLine();
			if (input.equalsIgnoreCase("y") || input.equals("")) {
				continue;
			}
			break;
		}

		keyIn.close();

		for (int i = 0; i < len; i++) {

			System.out.printf("%d, %s, %s , %s, %s\n" , no[i],name[i],email[i],phone[i],registeredDate[i]);
		
		}
	}
}
