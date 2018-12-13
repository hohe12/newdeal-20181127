import java.util.Scanner;

public class Test {
	int [] a;
	int b;
	int c;
	public Test() {
		
	}
	
	public void input() {
		int num = Integer.parseInt(new Scanner(System.in).next());
		a= new int [num];
		for(int i=0;i<num;i++) {
			 b = Integer.parseInt(new Scanner(System.in).nextLine());
			 for(int k =0;k<a.length;k++) {
				 if(b ==a[k] ) {
					 System.out.println("같은번호가 있습니다. 1부터 "+a.length+"사이의 숫자 다시 입력해주세요.");
					 i--;
				 }
			 }
			 a[i] = b;
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					c = a[i];
					a[i] = a[j];
					a[j] = c;
				}
			}
		}
		for(int j=0;j<a.length;j++) {
		System.out.println(a[j]);
		}
	}
}
