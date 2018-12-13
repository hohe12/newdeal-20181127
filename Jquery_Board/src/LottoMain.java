import java.util.Random;
import java.util.Scanner;

class Lotto {
	int[] loto = new int[6];
	Random random = new Random();
	int temp, sum, avg;

	//번호 추첨
	public void selectNumber(int number) {
		for (int i = 0; i < loto.length; i++) {
			loto[i] = (int) (Math.random() * 46) + 1;
			if (loto[i] % 2 == 0 && number == 2) {
				lottocheck(i);
			} else if (loto[i] % 2 == 1 && number == 3) {
				lottocheck(i);
			} else if (number == 1) {
				lottocheck(i);
			} else {
				i--;
			}
		}
		lottoreset(number);
	}
	
	// 같은번호 있는지체크
	public void lottocheck(int i) {
		for (int j = 0; j < i; j++) {
			if (loto[i] == loto[j]) {
				i--;
			}
		}
	}
	
	//로또번호 초기화
	public void lottoreset(int number) {
		for (int i = 0; i < loto.length; i++) {
			sum += loto[i];
		}
		avg = (sum / loto.length);
		if (!(avg >= 30 && avg <= 35)) {
			System.out.println("평균값 : " + avg + " 실패!! (30~35 사이가 아닙니다.)");
			sum = 0;
			selectNumber(number);
		}
	}
	
	//로또번호 정렬
	public void sortNumber() {
		for (int i = 0; i < loto.length; i++) {
			for (int j = i + 1; j < loto.length; j++) {
				if (loto[i] > loto[j]) {
					temp = loto[i];
					loto[i] = loto[j];
					loto[j] = temp;
				}
			}
		}
	}
	
	//로또번호 출력
	public void showNumber() {
		System.out.println("평균값 : " + avg+" 성공!!");
		for (int i = 0; i < loto.length; i++) {
			System.out.print(loto[i] + "  ");
		}
	}
	
	//로또 홀,짝수 선택
	public int lottoshow() {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("============================================================");
		System.out.println("평균값 30~35뽑아주는 로또기");
		System.out.println("홀수,짝수 상관없어요 [1] // 짝수만뽑고싶어요 [2] // 홀수만뽑고싶어요 [3]");
		System.out.println("============================================================");
		System.out.println("로또타입선택 : ");
		
		int number = scn.nextInt();
		
		if(!(number==1 || number==2 || number== 3)) {
			System.out.println("\n************입력오류(1~3선택하세요)****************\n");
			return lottoshow();
		}else {
			return number;
		}
	}
}

public class LottoMain {
	public static void main(String[] args) {

		Lotto lotto = new Lotto();
		int number = lotto.lottoshow();
		lotto.selectNumber(number);
		lotto.sortNumber();
		lotto.showNumber();
	}
}