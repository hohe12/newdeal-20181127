import java.util.Set;
import java.util.TreeSet;

public class Lotto {
	int a;
	
	
	public Set<Integer> number() {
		Set<Integer> num = new TreeSet<Integer>();
		for (int i = 0; i < 6; i++ ) {
			a = (int) (Math.random() * 45) + 1;
			if(num.contains(a)) {
				i--;
			}
			num.add(a);		
		}
		
		return num;
	}
	
	public void writenumber(Set<Integer> num) {
		System.out.println(num.toString());
	}
}
