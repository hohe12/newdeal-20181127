import java.sql.Date;
import java.util.Scanner;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App3 {

    public static void main(String[] args) {
     Scanner keyIn = new Scanner(System.in);
     
     System.out.println("번호? ");
     int no = Integer.parseInt(keyIn.nextLine());
     
     System.out.print("내용? ");
     String contents = keyIn.nextLine();
     
     Date registeredDate = new Date(System.currentTimeMillis());
     
     keyIn.close();
     
     System.out.println("번호: " + no);
     System.out.printf("내용: %s\n", contents);
     System.out.printf("작성일: %s\n", registeredDate); 
     System.out.println("조회수: " + 0);
    }
}
