import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		Set<Integer> num = lotto.number(); // 번호추출
		lotto.writenumber(num); // 파일쓰기
	}

}
