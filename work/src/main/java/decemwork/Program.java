package decemwork;

public class Program {
	public static void main(String[] args) {
		long i = (int) (Math.random()*500000000)+1;
		String a="";
		i = (int)(Math.random()*50)+1;
		System.out.println(i);
		System.out.println(i%3);
		int b = (int) (i/3);
		if(i % 3 == 0) {
			a="4";
		}else if(i % 3 == 1) {
			a="1";
		}else if(i % 3 == 2) {
			a="2";
		}
		System.out.println(a);
       

	}
}
