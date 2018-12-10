package com.bit.newdeal;

public class Program {

	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		int [] num = lotto.number(); // 번호추출
		int [] result =lotto.sort(num);// 정렬
		lotto.writenumber(result); // 파일쓰기
	}

}
