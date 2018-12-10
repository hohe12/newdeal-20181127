package com.bit.user;
import java.util.HashSet;

public class Lotto {
	int a,b;
	
	
	public HashSet<Integer> number() {
		HashSet<Integer> num = new HashSet<Integer>();
		for (int i = 0; i < 6; i++ ) {
			a = (int) (Math.random() * 45) + 1;
			num.add(a);		
		}
		
		return num;
	}
	

	public void writenumber(HashSet<Integer> num) {
		System.out.println(num.toString());
	}
}
