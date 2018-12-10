package com.bit.user;
import java.util.HashSet;

public class Program {

	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		HashSet<Integer> num = lotto.number(); // 번호추출
		lotto.writenumber(num); // 파일쓰기
	}

}
