import java.util.Random;
import java.util.Scanner;

public class Program3 {
	int i,num;
	Scanner sc;
	
	public static void main(String[] args) {
		Program3 pro = new Program3();
		pro.updown();
	}
	
	public void updown() {
		System.out.println("수를 결정했습니다.맞춰보세요.0~99 >>");
		sc = new Scanner(System.in);
		Random rd = new Random();
		i = (int) (Math.random() * 99);
		
		for (int j=1;;j++) {
			System.out.println(j+">>");
			num = Integer.parseInt(sc.nextLine());
			if (num > i) {
				System.out.println("더 낮게");
			} else if (num == i) {
				System.out.println("정답입니다.");
				System.out.println("다시 하시겠습니까?(y/n)");
				String re = sc.nextLine().trim();
				System.out.println(re);
				if (re.equalsIgnoreCase("y")) {
					updown();
				} else if(re.equalsIgnoreCase("n")) {
					break;
				}
				break;
			} else {
				System.out.println("더 높게");

			}
		}
	}
}
